package IfElseStatements;

import java.util.Scanner;

public class Building {
        public static void main(String[] args) {
            // Write a program that will take ask the user for their age.
            // Let the user know if they have access to the building.
            // They must be 30 years old to have access to the building.
            // If the user enters an age above 100 or age  less than 0, print “Not a valid age”.
            // If they are old enough print “Welcome to the building” but if they are too young
            // print “Sorry try again when you’re 30”

            Scanner input = new Scanner(System.in);
            int givenAge = input.nextInt();

            if (givenAge>100 || givenAge<0){
                System.out.println("Not a valid age");
            }else if (givenAge>=30){
                System.out.println("Welcome to the building");
            }else{
                System.out.println("Sorry try again when you’re 30");
            }
        }
    }

