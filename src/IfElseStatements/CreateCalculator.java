package IfElseStatements;

import java.util.Scanner;

public class CreateCalculator {
    // Create a calculator
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        input.nextLine();
        String operator = input.nextLine();

        if (operator.equals("+")) {
            System.out.println("Result of " + num1 + operator + num2 + " is: " + (num1 + num2));
        } else if (operator.equals("-")) {
            System.out.println("Result of " + num1 + operator + num2 + " is: " + (num1 - num2));
        } else if (operator.equals("*")) {
            System.out.println("Result of " + num1 + operator + num2 + " is: " + (num1 * num2));
        } else if (operator.equals("/")){
            System.out.println("Result of " + num1 + operator + num2 + " is: " + (num1 / num2));
        }
    else{
            System.out.println("Invalid operator entered. Please try again!");
        }

    }
}
