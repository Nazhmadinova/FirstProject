package Loop;

import java.util.Scanner;

public class WhileEnterNumber {
    public static void main(String[] args) {
        //Write a program that asks the user to enter a number more than 0.
        // Print the all the numbers from 0 to the entered number.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = input.nextInt();
        int i =0;
        while (i<=number){
            System.out.println(i);
            i++;
        }
    }
}
