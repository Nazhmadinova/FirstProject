package Operators;

import java.util.Scanner;

public class Tasks2 {
    public static void main(String[] args) {
        // Task 4
        //Write a program that will ask user to enter a boolean: true or false.
        // Print the opposite of the boolean they gave.
        // > input: true
        // > output: false
        Scanner scanner = new Scanner(System.in);
//        System.out.println("True or False?");
//        boolean result = scanner.nextBoolean();
//        System.out.println(!result);

        // Task 5
        // Write a program that will ask user to enter two characters.
        // Declare a boolean with the following value: charOne > charTwo. Print the resulting boolean.
        char one = scanner.nextLine().charAt(0); // A
        char two = scanner.nextLine().charAt(0); //B
        boolean b = one > two;
        System.out.println(b);

        // Task 6
        // Write a program that will ask user to enter two numbers.
        // Declare a boolean with the following value: numberOne == numberTwo.
        // Print the resulting boolean.
        // > input: 4, 5
        // >output: false
        int number1= scanner.nextInt();
        int number2 = scanner.nextInt();
        boolean result = number1 == number2;
        System.out.println(result);

    }
}
