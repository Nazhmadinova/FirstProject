package Projects.Project1;

import java.util.Scanner;

public class CalculatePhoneBill {
    public static void main(String[] args) {
//Write a Java program CalculatePhoneBill to calculate the monthly telephone bills as per the following rule:
//Ask user to enter number of calls.
//Minimum $200 for up to 100 calls.
//Plus $0.60 per call for next 50 calls.
//Plus $0.50 per call for next 50 calls.
//Plus $0.40 per call for any call beyond 200 calls.
//
//Examples:
//Enter number of calls: 88
//Your bill is $200.0
//
//Enter number of calls: 120
//Your bill is $212.0
//
//Enter number of calls: 185
//Your bills is $247.5
        Scanner input = new Scanner(System.in);
        int numberOfCall;
        double bill=0.0;
        System.out.println("Enter number of calls:");
        numberOfCall = input.nextInt();


        if(numberOfCall<=100){
            bill=200;
        }else if(numberOfCall>100 && numberOfCall<=150){
            bill =200+(numberOfCall-100)*0.60;

        }else if (numberOfCall>150 && numberOfCall<=200){
            bill=200+50*0.60+(numberOfCall-150)*0.50;

        }else if(numberOfCall>200){
            bill=200+50*0.60+50*0.50+(numberOfCall-200)*0.40;

        }

        System.out.println("Your bill is $"+bill);
    }
}
