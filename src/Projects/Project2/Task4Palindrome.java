package Projects.Project2;

import java.util.Scanner;

public class Task4Palindrome {
    public static void main(String[] args) {
        //Accept a string and if it is palindrome, print "Palindrome", if not print "Not Palindrome"
        //(It should be case-insensitive).
        //
        //Example 1
        //Input:
        //civic
        //Output:
        //Palindrome
        //Example 2
        //Input:
        //java
        //Output:
        //Not Palindrome
        //Example 3
        //Input:
        //Mom
        //Output:
        //Palindrome
        System.out.println("Enter the word:");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        word.trim();
        String back ="";
        for(int i = word.length() -1; i >= 0; i--){
            back += word.charAt(i);
        }

        if(word.equalsIgnoreCase(back)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    }



