package Projects.Project2;

import java.util.Scanner;

public class Task1Fibonacci {
    public static void main(String[] args) {
        //Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 24 .....
        //
        //Example:
        //Input:
        //6
        //Output:
        //0 1 1 2 3 5
        System.out.println("Enter the number:");
        Scanner input =new Scanner(System.in);
        int x = input.nextInt();

        int t1 = 0, t2 = 1;
        for(int i = 0; i< x; i++){
            System.out.print(t1 + " ");
            int sum = t1+ t2;
            t1 = t2;
            t2 = sum;
        }
    }



}
