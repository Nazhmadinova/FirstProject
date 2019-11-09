package Loop;

import java.util.Scanner;

public class ForPalindrome {
    public static void main(String[] args) {
        //[IQ] Palindrome: A word that is the same read forwards and backwards.
        // User takes a word from the console. Print true if the word is a palindrome.
        // Print false if the word is not palindrome.
        //> input: civic
        //> output: true
        Scanner input =new Scanner(System.in);
        String word =input.nextLine();

        String back ="";
        for(int i=word.length()-1;i>=0;i--){
            back+=word.charAt(i);
        }
        System.out.println(word);
        System.out.println(back);

        if(word.equals(back)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
