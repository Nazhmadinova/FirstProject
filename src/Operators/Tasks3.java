package Operators;

import java.util.Scanner;

public class Tasks3 {
    public static void main(String[] args) {
        // Task 7
        // Write a program what asks the user to enter two decimal numbers.
        // Take these two numbers and perform all the mathematical operations (+,-, *, /, %) on them.
        // Print all the results.
        // > input 3.5, 6
        // > output: Addition: 9.5
        // etc for Subtraction, Multiplication, Division, Remainder
        Scanner input = new Scanner(System.in);
//        double num = input.nextDouble();
//        double numb = input.nextDouble();
//        System.out.println(num+numb);
//        System.out.println(num-numb);
//        System.out.println(num*numb);
//        System.out.println(num/numb);
//        System.out.println(num%numb);

        // Task 9
        // Write a program that asks the user to enter a number between 1 -100
        // Declare a boolean that will check if the entered number is actually within the given range.
        // Make sure the number is more than 0 and less than 101.
        // If the number meets both of those requirements the resulting boolean should be
        // printed as true otherwise if either of them is not meet the result should be false.
        // > input: 200
        // > output: false
        System.out.println("Enter number between 1-100: ");
        int number = input.nextInt();
        boolean result = number > 0 &&  number <101;
        System.out.println(result);



    }
}
