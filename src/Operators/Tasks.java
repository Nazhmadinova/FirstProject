package Operators;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        // Task 1
        // Ask user to enter their information using the following datatypes:
        // name - string
        // gender - char
        // age - int
        // phone number - long
        // gpa - double
        // —> After getting the information print the information in this format:
        // Name: givenName Gender: givenGender etc....

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Name:");
//        String name = scanner.nextLine();
//        System.out.println("Gender:");
//        char gender = scanner.nextLine().charAt(0);
//        System.out.println("Age:");
//        int age = scanner.nextInt();
//        System.out.println("Phone number:");
//        long number = scanner.nextLong();
//        System.out.println("gpa:");
//        double gpa = scanner.nextDouble();

        // Task 2
        // Write a program that will ask user to enter two whole numbers.
        // Increment the first number by the second number 3 times.
        // Print the information in this format:
        // Your number is: firstNumber after being incremented by secondNum counter times
        System.out.println("Number1:");
        int number1 = scanner.nextInt();
        System.out.println("Number2:");
        int number2 = scanner.nextInt();
        int counter = 0;
        number1 +=number2;
        counter++;
        System.out.println("Your number is: " + number1+ " after being incremented by " + number2+ " " + counter + " times");
        number1 +=number2;
        counter++;
        System.out.println("Your number is: " + number1+ " after being incremented by " + number2+ " " + counter + " times");
        number1 +=number2;
        counter++;
        System.out.println("Your number is: " + number1+ " after being incremented by " + number2+ " " + counter + " times");

        // Task 3
        // Write a program that will ask user to enter two numbers.
        // Declare a boolean with the following value: numberOne > numberTwo. Print the resulting boolean.
        System.out.println("Number1:");
        int number4 = scanner.nextInt();
        System.out.println("Number2:");
        int number5 = scanner.nextInt();
        boolean result = number4 > number5;
        System.out.println(result);





    }
}
