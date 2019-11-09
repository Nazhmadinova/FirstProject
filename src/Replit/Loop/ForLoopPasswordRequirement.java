package Replit.Loop;

import java.util.Scanner;

public class ForLoopPasswordRequirement {
    public static void main(String[] args) {
        //Ask user to enter a new password. If the password does not match any of the requirements below,
        // print a message based on what requirement it is breaking.
        // If it does not break any requirement, print ‘Password accepted’.
        //Password requirements:
        //Be a minimum of eight (8) characters in length
        //Contain at least one uppercase letter (A-Z)
        //Contain at least one lowercase letter (a-z)
        //Contain at least one digit (0-1-2-3-4-5-6-7-8-9)
        //Contain at least one special character (~`!@#$%^&*()+=_-{}[]\|:;”’?/<>,.)

        //Input:
        //oxidex
        //Output:
        //Password should contain minimum 8 characters

        //Input:
        //abcdefghi
        //Output:
        //Password should contain at least 1 uppercase number

        //Input:
        //ABCDEFGHI
        //Output:
        //Password should contain at least 1 lowercase number

        //Input:
        //Abcdefghi
        //Output:
        //Password should contain at least 1 digit

        //Input:
        //Abcdefghi1
        //Output:
        //Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]\|:;”’?/<>,.

        //Input:
        //Abcdefghi1$
        //Output:
        //Your password is accepted

        System.out.println("Please enter word:");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int uppercase = 0;
        int lowercase = 0;
        int digit = 0;
        int specialCharacter = 0;
        if (str.length() >= 8) {
            for (int i = 0; i <= str.length()-1; i++) {
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                    uppercase++;
                }
                if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                    lowercase++;
                }
                if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                    digit++;
                }
                if ((str.charAt(i) >= 33 && str.charAt(i) <= 47) || (str.charAt(i)>=58&&str.charAt(i)<=64)||(str.charAt(i)>=91&&str.charAt(i)<=96)||(str.charAt(i)>=123&&str.charAt(i)<=126)) {
                    specialCharacter++;
                }
            }
            if (uppercase > 0) {
                if (lowercase > 0) {
                    if (digit > 0) {
                        if (specialCharacter > 0) {
                            System.out.println("Your password is accepted");
                        } else {
                            System.out.println("Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]|:;”’?/<>,.");
                        }
                    } else {
                        System.out.println("Password should contain at least 1 digit");
                    }
                } else {
                    System.out.println("Password should contain at least 1 lowercase number");
                }
            } else {
                System.out.println("Password should contain at least 1 uppercase number");
            }
        } else {
            System.out.println("Password should contain minimum 8 characters");
        }
    }
}
