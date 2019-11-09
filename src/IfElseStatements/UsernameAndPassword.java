package IfElseStatements;

import java.util.Scanner;

public class UsernameAndPassword {
    public static void main(String[] args) {
        // Create 2 String variables for your username and password.
        // Write a program that asks from the user to enter the username .
        // if username matches then ask for password.
        // if password matches too, then print "Login successful".
        // if username is tru but password is not true, print "wrong password"
        //if username does not match, print "invalid username"

        String username = "Gulzhaina";
        String password = "12345";
         Scanner input = new Scanner(System.in);
         String username2 = input.nextLine();


         if(username2.equals(username)){
             System.out.println("Please enter your password:  ");
             String password2 =input.nextLine();
             if(password2.equals(password)){
                 System.out.println("Login successful");
             } else{
                 System.out.println("Wrong password");
             }
         }
         else {
             System.out.println("invalid username");
         }

    }


}
