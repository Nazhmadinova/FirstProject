package Loop;

import java.util.Scanner;

public class ForWithIfPassword3Times {
    public static void main(String[] args) {
        //Give 3 attempts to login.
        //If user fails to enter right password within 3 attempts print "Sorry.
        // You account is locked. Try after 5 hours" and end the program.

        Scanner input =new Scanner(System.in);
        String password = "secret478";
        int i = 1;
        for(;;i++){
            System.out.println("Enter password");
            String pass=input.nextLine();

            if(i==3){
                System.out.println("Sorry. You account is locked. Try after 5 hours");
                break;
            }

            if(pass.equals(password)) {
                System.out.println("Welcome to your profile!");
                break;
            }
        }
    }
}
