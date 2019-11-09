package scanner;

import java.util.Scanner;

public class CalculatorMinutesIntoHours {

    public static void main(String[] args) {

        // Write a program that calculates minutes into hours and minutes

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  minutes: ");
        int mins = scanner.nextInt();
        int hours = mins/60;
        int remaindingMinutes = mins %60;
        System.out.println(mins + " minutes is " + hours + " hours and " + remaindingMinutes + "minutes");

    }
}

