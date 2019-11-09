package IfElseStatements;

import java.util.Scanner;

public class PassCode {
    public static  void main(String[] args){
        int passCode = 3241;

        // Write a program that asks to enter 4 digit integer via scanner
        // compare the passCode
        // if valid passCode print "Welcome to iPhone"
        // if invalid print "Try again"
        // Check for special case:
        // 1. check for negative numbers. If entered passCode is negative
        // print  "No Negative number"
        //2. passCode must be only 4 digits
        // if more than 4 digits then print "You entered more digits"
        // if less than 4 digits then print "You entered less digits"

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(passCode == num) {
            System.out.println("Welcome to your iPhone!");
        }
        else if(num < 0) {
                System.out.println("No Negative number");
        } else if(num < 1000) {
                System.out.println("You entered less digits");
        } else if(num > 9999) {
                System.out.println("You entered more digits");
        }
        else {
                System.out.println("Wrong passcode! Try again");
        }
        }
    }

