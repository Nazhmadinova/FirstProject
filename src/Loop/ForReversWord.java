package Loop;

import java.util.Scanner;

public class ForReversWord {
    public static void main(String[] args) {
        //Write a program that reverses the String. Ask for a word from the user and reverse the word.
        //Flow:
        //Please enter the word:
        //James
        //semaJ
        //Please enter the word:
        //hello
        //olleh
        //Hint: use charAt, length

        Scanner input =new Scanner(System.in);
        System.out.println("Enter word");
        String word = input.nextLine();

        for(int i =(word.length()-1);i>=0;i--){
            System.out.print(word.charAt(i));
        }
    }
}
