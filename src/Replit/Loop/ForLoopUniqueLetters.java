package Replit.Loop;

import java.util.Scanner;

public class ForLoopUniqueLetters {
    public static void main(String[] args) {
        //Accept a String and print only unique characters in the String:
        //Input:
        //java
        //Output:
        //jav
        //
        //Input:
        //aabcddee
        //Output:
        //abcde
        Scanner scanner = new Scanner(System.in);
        String word=scanner.nextLine();
        String checked ="";

        for(int i=0;i<word.length();i++){
            if(!checked.contains(word.charAt(i)+"")){
                checked+=word.charAt(i)+"";
            }
        }
        System.out.println(checked);
    }
}
