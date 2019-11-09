package IfElseStatements;

import java.util.Scanner;

public class BiggestNum {
    public static void main(String[] args) {
        //Write a program that will ask the user to enter three numbers.
        //If the numbers are the same print “All integers are the same”
        //If they are not equal, print which is the biggest value of the three numbers
        //—> If there is two numbers which are the largest print the one that came first
        //> Input: 3,2,6
        //> Output: The biggest number from 3, 2 and 6 is: 6
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers, hit enter after each number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if (num1 == num2 && num1 == num3) {
            System.out.println("All the numbers are equal");
        } else if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the biggest");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the biggest");
        } else {
            System.out.println(num3 + " is the biggest");
        }

    }
}