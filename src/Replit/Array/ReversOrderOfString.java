package Replit.Array;

import java.util.Scanner;

public class ReversOrderOfString {
    public static void main(String[] args) {
        //Given a String variable sentence, write code to type each word in separate lines in a reverse order.
        //Example:
        //sentence -> "Java is fun"
        //Print
        //fun
        //is
        //Java
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence");
        String sentence = input.nextLine();

        String [] separate=sentence.split(" ");
        for(int i=(separate.length-1);i>=0;i--){
            System.out.println(separate[i]);
        }
    }
}
