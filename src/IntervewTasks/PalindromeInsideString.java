package IntervewTasks;

import java.util.Arrays;

public class PalindromeInsideString {

    //input: myracecar
    //output: racecar

//    //[[true, false, false, false, false, false, false, false, false],
//    // [false, true, false, false, false, false, false, false, false],
//    // [false, false, false, false, false, false, false, false, false],
//    // [false, false, false, false, false, false, false, false, false],
//    // [false, false, false, false, false, false, false, false, false],
//    // [false, false, false, false, false, false, false, false, false],
//    // [false, false, false, false, false, false, false, false, false],
//    // [false, false, false, false, false, false, false, false, false],
//    // [false, false, false, false, false, false, false, false, false]]
//
//
//
//    public static String getPalindrome(String input){
//        if(input.isEmpty()) {
//            return "";
//        }
//        int n = input.length();
//        int longestSoFar = 0, startIndex = 0, endIndex = 0;
//        boolean[][] palindrome = new boolean[n][n];
//
//        System.out.println(Arrays.deepToString(palindrome));
//        for(int j = 0; j < n; j++) {
//            palindrome[j][j] = true;
//            for(int i = 0; i < j; i++) {
//                if(input.charAt(i) == input.charAt(j) && (j-i <= 2 || palindrome[i+1][j-1])) {
//                    palindrome[i][j] = true;
//                    if(j-i+1 > longestSoFar) {
//                        longestSoFar = j-i+1;
//                        startIndex = i;
//                        endIndex = j;
//                    }
//                }
//            }
//        }
//        return input.substring(startIndex, endIndex+1);
//    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("myracecar"));
    }

    public static int expandFromMiddle(String s, int left, int right){
        if(s == null) return 0;

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return right - left + 1;
    }

    public static String longestPalindrome(String s){

        if(s == null || s.length() < 1) return "";

        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++){
            int len1 = expandFromMiddle(s, i, i);
            int len2 = expandFromMiddle(s, i, i+1);
            int len = Math.max(len1, len2);
            if(len > end - start + 1){
                start = i - (len - 1)/ 2;
                end = i + len / 2;
            }
        }

        return s.substring(start + 1, end);
    }


}
