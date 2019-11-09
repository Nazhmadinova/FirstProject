package Projects.Project1;

import java.util.Scanner;

public class QuarterDimesNickel {
    public static void main(String[] args) {
//        Write a program that determines the change to be dispensed from a vending
//machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
//increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
//dollar bill to pay for the item.
        //See the example output as shown below:
        //Input:
        //Enter price in cents: 95↵
        //Output:
        //Your change is 0 quarters, 0 C, and 1 nickels.

        Scanner input = new Scanner(System.in);
        int price=0;
        int quarter=0;
        int dime = 0;
        int nickle=0;

        System.out.println("Enter price in cents:");
        price = input.nextInt();
        if(price>=25 && price<=100 && price%5==0){
            int remain =100-price;
         quarter = (remain / 25);
         remain = remain % 25;
         dime = remain / 10;
        remain = remain % 10;
         nickle = remain / 5;

            System.out.println("Your change is "+quarter+" quarters,"+dime+" dimes, "+nickle+" nickles");

        }else{
            System.out.println("Invalid");
        }
    }
}
