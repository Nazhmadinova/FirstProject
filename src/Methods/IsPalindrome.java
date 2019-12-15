package Methods;

public class IsPalindrome {

//    public static boolean  isPalindrome(String str){
//        String rev = "";
//        for(int i = str.length()-1; i >=0 ; i--){
//            rev += str.charAt(i);
//        }
//
//        if(str.equalsIgnoreCase(rev)){
//            return true;
//        }
//        return false;
//    }

    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;

        while (start < end){
            start++;
            end--;
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("civic"));
    }
}
