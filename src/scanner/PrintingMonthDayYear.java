package scanner;

import java.util.Scanner;

// Create three int variables: month, day, year
// Take those values and put them into a string in this format: "M/D/Y"
// > input:
// Month: 5
// Day: 20
// Year: 2019
// > output:
// 5/20/2019

public class PrintingMonthDayYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Month: ");
        int month =scanner.nextInt();
        System.out.println("Day: ");
        int day = scanner.nextInt();
        System.out.println("Year: ");
        int year = scanner.nextInt();
        String result = "" + month + "/" + day + "/" +year;
        System.out.println(result);

        // After printing the original date, add 5 to the years and subtract 1 from the day. Print the new date value.
        // > input - as values are above
        // > output: 5/19/2024

        year += 5;
        day -=1;
         String result2 = "" + month + "/" + day + "/" + year;
        System.out.println(result2);


    }

}
