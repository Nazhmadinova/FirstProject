package Array.StringManiMethods;

import java.util.Arrays;

public class PrintBiggestString {
    public static void main(String[] args) {
        //Given the String:
        //"Write a program that creates a group of given size thisisabigword”
        //Find the biggest word in your String and print it.

        String str ="Write a program that creates a group of given size thisisabigword";
        String [] separate=str.split(" ");
        System.out.println(Arrays.toString(separate));
        int max=separate[0].length();

        for(int i=0;i<separate.length;i++){

            if(separate[i].length()>max){
                max=separate[i].length();
            }
        }
        System.out.println(max);

        for(int i =0;i<separate.length;i++){
            if(separate[i].length()==max){
                System.out.println(separate[i]);
            }
        }
        //Other way
        //String str = "write a program that creates a group of given size thisisabigword";
        //        String [] arr = str.trim().split(" ");
        //        int biggestLength = 0;
        //        String biggestWord = "";
        //        for(String word : arr) {
        //            if(word.length() > biggestLength) {
        //                biggestLength = word.length();
        //                biggestWord = word;
        //            }
        //        }
        //        System.out.println(biggestWord);
        //        for(String word: arr) {
        //            if(word.length() == biggestLength) {
        //                System.out.println(word);
        //            }
        //        }

    }
}
