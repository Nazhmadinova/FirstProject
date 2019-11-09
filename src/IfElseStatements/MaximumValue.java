package IfElseStatements;

import java.util.Scanner;

public class MaximumValue {
    public static void main(String[] args) {
        // Find maximum value among those 3 entered integers
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1>num2 && num1>num3) {
            System.out.println("Max number is: " + num1);
        }
        else if (num2>num1 && num2>num3) {
            System.out.println("Max number is: " + num2);
        }
        else if (num3>num1 &&num3>num2){
            System.out.println("Max number is: " + num3);
        }
        else if (num1==num2 && num1==num3){
            System.out.println("All numbers are equal");
        }


    }
}
