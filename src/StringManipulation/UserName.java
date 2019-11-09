package StringManipulation;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
//        Credentials: Given two existing data: user and pass of “test” and “test123”
//Write a program that asks users to enter a username and password.
//—> If the username and password match print: “ Welcome!”
//—> If username is incorrect print: “invalid username” and don’t ask for the password
//—> If password is incorrect print: “invalid password”

        String user ="test";
        String pass ="test123";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = input.nextLine();

        if(username.equals(user)){
            System.out.println("Enter your password:");
            String password =input.nextLine();
            if(password.equals(pass)){
                System.out.println("Welcome!");
            }else{
                System.out.println("Invalid password");
            }
        }else {
            System.out.println("Invalid username");
        }
    }
}
