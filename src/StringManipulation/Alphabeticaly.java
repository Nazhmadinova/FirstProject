package StringManipulation;

import java.util.Scanner;

public class Alphabeticaly {
    public static void main(String[] args) {
       // User takes two strings from the user.
        // Compare the Strings and print out the String that comes first lexicographically.

        Scanner input = new Scanner(System.in);
        String word=input.nextLine();
        String word2=input.nextLine();
        int compare =word.compareTo((word2));

        if(compare>0){
            System.out.println(word2);
        }else if (compare<0){
            System.out.println(word);
        }else{
            System.out.println("Equals");
        }
    }
}
