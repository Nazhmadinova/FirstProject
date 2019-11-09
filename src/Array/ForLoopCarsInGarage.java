package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ForLoopCarsInGarage {
    public static void main(String[] args) {
        //Write a program that asks the number of cars user has and create an array of String with given size.
        // Then ask the user to enter each car. After getting all the cars, print the array.

        //Flow: Enter number of cars: 
        // > 3 
        // Enter car 1:
        //  > BMW 
        // Enter car 2: 
        // > Mercedes 
        // Enter car 3: 
        // > Toyota
        //[BMW, Mercedes, Toyota]

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of cars:");
        int num = input.nextInt();
        input.nextLine();

        String [] cars = new String[num];

        for(int i=0;i<cars.length; i++){
            System.out.println("Enter car "+(i+1)+":");
             cars[i] =input.nextLine();

        }
        System.out.println(Arrays.toString(cars));
    }
}
