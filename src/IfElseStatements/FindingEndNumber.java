package IfElseStatements;

import java.util.Scanner;

public class FindingEndNumber {
    public static void main(String[] args) {
//        Given an integer, n , perform the following conditional actions:
//        If  is end with 3, print Cool, if not the print Not Cool
        System.out.println("Please enter:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // To find last digit of a number,
        // we use modulo operator %. When modulo divided by 10 returns its last digit.
        // suppose if n = 1234 then last digit = n%10=> 4

        // To find first digit of a number we divide the given number by 10 until number is greater than 10.
        // At the end we are left with the first digit.

        if(n%10==3){
            System.out.println("Cool");
        }
        else{
            System.out.println("Not Cool");
        }

    }
}
