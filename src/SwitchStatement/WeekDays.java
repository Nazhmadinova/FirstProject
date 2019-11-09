package SwitchStatement;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
// Write a program that asks a user to enter a number corresponding
// to the day of the week starting from 1 being Sunday, 2 being Monday, etc…
// If the number is not between 1 and 7 print “invalid day”
//> input: 7
//  > output: Saturday

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String word = "";
        boolean valid= true;

        switch(num){
            case 1:
                word = "Sunday";
                break;
            case 2:
                word = "Monday";
                break;
            case 3:
                word="Tuesday";
                break;
            case 4:
                word= "Wednesday";
                break;
            case 5:
                word ="Thursday";
                break;
            case 6:
                word ="Friday";
                break;
            case 7:
                word ="Saturday";
                break;
            default:
                System.out.println("Invalid day");
                valid=false;
        }
        if(valid){
            System.out.println(word);
        }else {
            System.out.println("fail");
        }

    }
}
