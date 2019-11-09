package StringManipulation;

import java.util.Scanner;

public class NameCool {
    public static void main(String[] args) {
       // User is asked to enter their name. You will check if it is a cool name.
        // > If the name begins with an ‘a’ or a ‘z’ print “Your name is cool”
        // > Otherwise print “Sorry not a cool name”

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        if(name.startsWith("a") || (name.startsWith("z"))){
            System.out.println("Your name is cool");
        }else {
            System.out.println("Sorry not a cool name");
        }

    }
}
