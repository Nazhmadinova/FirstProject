package IntervewTasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BiggestPalindrome {

    //Create a method that will accept an ArrayList of Strings. Return the biggest Palindrome.

    public static String biggestPalindrome(ArrayList<String> list){

        Map<Integer, String> map = new HashMap<>();
        ArrayList<Integer> nums = new ArrayList<>();

        for(String str: list){
            if(isPalindrome(str)){
                map.put(str.length(), str);
                nums.add(str.length());

            }
        }

        if(nums != null){
            int max = nums.get(0);
            for(Integer num: nums){
                if(max < num){
                    max = num;
                }
            }

            System.out.println(map.get(max));
        }
        return null;
    }

    public static boolean isPalindrome(String str){
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    //other way

    public static String biggestPalindrome2 (ArrayList<String> words) {
        String palindrome = "";
        for(String word: words) {
            if(isPalindrome2(word) && word.length() > palindrome.length()){
                palindrome = word;
            }
        }
        return palindrome;
    }
    static boolean isPalindrome2(String word) {
        return new StringBuilder(word).reverse().toString().equals(word);
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("civic");
        list.add("ada");
        list.add("pacaacap");
        list.add("lacaacal");
        biggestPalindrome(list);

    }

    //other way
    public static String biggestPalindrome3 (ArrayList<String> words) {
        String palindrome = "";
        outer:  for(String word: words) {
            for(int i=0; i < word.length()/2; i++) {
                if(word.charAt(i) != word.charAt(word.length()-1 - i)) {
                    continue outer;
                }
            }
            if(word.length() > palindrome.length()) {
                palindrome = word;
            }
        }
        return palindrome;
    }


}
