package IfElseStatements;

import java.util.Scanner;

public class BooleanCondition {
    public static void main(String[] args) {
//        Given an integer, n , perform the following conditional actions:
//        If  is odd, print Weird
//        If  is even and in the inclusive range of 2 to 5, print Not Weird
//        If  is even and in the inclusive range of 6 to 20, print Weird
//        If  is even and greater than 20 , print Not Weird

        System.out.println("Please enter:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean condition;
        boolean condition1=n%2!=0;
        boolean condition2=n%2==0 && n>=2 && n<=5;
        boolean condition3=n%2==0 && n>=6 && n<=20;
        boolean condition4 =n%2==0 && n>20;
        if(condition1){
            System.out.println("Weird");
        }
        else if(condition2){
            System.out.println("Not Weird");
        }
        else if(condition3){
            System.out.println("Weird");
        }
        else if(condition4){
            System.out.println("Not Weird");
        }

    }

}
