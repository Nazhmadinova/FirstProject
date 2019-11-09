package SwitchStatement;

import java.util.Scanner;

public class ForChar {
    public static void main(String[] args) {
        // Ask user to enter their letter grade, take it as character.
        // Give them back some result based on their letter grade.
        // a - Excellent!
        //b - Great!
        //c- Okay
        // d - you can do better
        // f- something needs to change
        // if none of these letter - not a valid letter grade
        // Bonus: Take into consideration if the user puts a capital or lower
        // case letter . The result for a and A should be the same

        Scanner input = new Scanner(System.in);
        char grade =input.nextLine().charAt(0);

        switch (grade){
            case 'a':
            case 'A':
                System.out.println("Excellent");
                break;
            case 'b':
            case 'B':
                System.out.println("Great!");
                break;
            case 'c':
            case 'C':
                System.out.println("Okay");
                break;
            case 'd':
            case 'D':
                System.out.println("You can do better");
                break;
            case 'f':
            case 'F':
                System.out.println("Something needs to change");
                break;
            default:
                System.out.println("Not a valid letter grade");
        }
//

    }
}