package StringManipulation;

import java.util.Scanner;

public class SubstringForSentence {
    //User is asked to enter a sentence.
    // Display the sentence with the first word moved to the end of the sentence.
    //> input: “Java is a fun language”
    //> output: “is a fun language Java”

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        int space = sentence.indexOf(" ");
        String firstWord = sentence.substring(0,space);
        String remain = sentence.substring(space+1);
        System.out.println(remain + " " + firstWord);


        System.out.println();
    }
}
