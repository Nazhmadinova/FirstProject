package StringManipulation;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
       // You have a value that hold what month it is (October).
        // Ask the user to enter the month from the console.
        // If the user’s input matches the expected month put print true,
        // but if the input does not match the actual month print false.
        // Uppercase and lowercase letters do not matter, we only care about the value.

        String month1= "October";
        Scanner input = new Scanner(System.in);
        String month2 = input.nextLine();
        Boolean condition1 = month2.equalsIgnoreCase(month1);
        System.out.println(condition1);
    }
}
