package SwitchStatement;

import java.util.Scanner;

public class NumbersInWordFormat {
    public static void main(String[] args) {
//        Write a program that will ask the user to enter a number from 1 to 9.
//        They should see the number they entered in word format.
//        If the number is not in the range print: “Invalid number”
//> input: 5
// > output: five

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        // Other way:
        // Scanner input = new Scanner(System.in);
        //        int number = input.nextInt();
        //        String word = "";
        //        switch (number) {
        //            case 1:
        //                word = "one";
        //                break;
        //            case 2:
        //                word = "two";
        //                break;
        //            case 3:
        //                word = "three";
        //                break;
        //            case 4:
        //                word = "four";
        //                break;
        //            case 5:
        //                word = "five";
        //                break;
        //            case 6:
        //                word = "six";
        //                break;
        //            case 7:
        //                word = "seven";
        //                break;
        //            case 8:
        //                word = "eight";
        //                break;
        //            case 9:
        //                word = "nine";
        //                break;
        //            default:
        //                word = "Not a valid Number";
        //        }
        //        System.out.println(word);

        switch (num){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
