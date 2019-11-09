package IfElseStatements;

import java.util.Scanner;

public class CountingEvenOdds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number:");
//        int num = input.nextInt();
//
//        if (num%2==0) {
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//
//        }

        // Count how many of them even and odds
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int evens =0;
        int odds =0;

        if (num1%2==0) {
            evens++;
        }else{
            odds++;
        }
        if (num2%2==0) {
            evens++;
        }else{
            odds++;
        }
        if (num3%2==0) {
            evens++;
        }else{
            odds++;
        }
        if (num4%2==0) {
            evens++;
        }else{
            odds++;
        }
        if (num5%2==0) {
            evens++;
        }else{
            odds++;
        }

        System.out.println("Total even number: " +evens);
        System.out.println("Total even number: " + odds);
    }
}

