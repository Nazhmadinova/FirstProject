package Operators;

import java.util.Scanner;

public class VendingMachineChange {
    public static void main(String[] args) {
        // Task 8
        // Vending machine change. Write a program that will ask used to enter a whole number from 1 to 99.
        // User will get back the amount of quarters, dimes, nickels, and pennies
        // that are needed to equal to the provided number.
        // > input Enter your change68
        // > output
        // Your change of 68 was converted to:
        // quarters: 2
        // dimes: 1
        // nickels: 1
        // pennies: 3
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers from 1 to 99:");
        int g = input.nextInt();
        int quarter = g/25;
        System.out.println(quarter);
        int h = g%25;
        int dime =h/10;
        System.out.println(dime);
        int j =h%10;
        int nickel = j/5;
        System.out.println(nickel);
        int k = j%5;
        int penny = k/1;
        System.out.println(penny);
        // or we can declare: int remainder = 0; remainder++; remainder ++; remainder++;
    }
}
