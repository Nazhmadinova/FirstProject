package StringManipulation;

import java.util.Scanner;

public class EnterName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        if (name.isEmpty()) {
            System.out.println("Invalid name");
        } else if (name.contains("a") || name.contains("A")) {
            System.out.println("Cool name");
        } else {
            System.out.println("Okay name");
        }
    }
}
