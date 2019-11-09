package SwitchStatement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        input.nextLine();
        System.out.println("Enter operator");
        String operator = input.nextLine();
// Create a calculator using a switch statement
// > User enters two numbers (int) and an operator(String of [+ , - , * , / ] )
//>Ex: 3,4,”+”      output: 3+4 = 7 ( this whole statement should be shown)
//> If operator provided isn’t one of the options, user should see message: “invalid operator”

        switch (operator) {
            case "+":
                System.out.println("Result of " + num1 + operator + num2 + " = " + (num1 + num2));
                break;
            case "-":
                System.out.println("Result of " + num1 + operator + num2 + " = " + (num1 - num2));
                break;
            case "*":
                System.out.println("Result of " + num1 + operator + num2 + " = " + (num1 * num2));
                break;
            case "/":
                System.out.println("Result of " + num1 + operator + num2 + " = " + (num1 /num2));
                break;
            default:
                System.out.println("invalid operator");

        }
  //      Other way:
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number one");
//        double num = input.nextDouble();
//        System.out.println("Enter number two");
//        double num2 = input.nextDouble();
//        input.nextLine();
//        System.out.println("Enter the operator");
//        String op = input.nextLine();
//        double result = 0;
//        boolean valid = true;
//        switch (op) {
//            case "+":
//                result = num + num2;
//                break;
//            case "-":
//                result = num - num2;
//                break;
//            case "*":
//                result = num * num2;
//                break;
//            case "/":
//                result = num / num2;
//                break;
//            case "%":
//                result = num % num2;
//                break;
//            default:
//                System.out.println("Invalid Operator");
//                valid = false;
//        }
//        if(valid) {
//            System.out.println(num + op +  num2 + "= " + result);
//        }


    }
}
