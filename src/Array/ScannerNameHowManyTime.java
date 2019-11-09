package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerNameHowManyTime {
    public static void main(String[] args) {
        //Write a program that will ask user to enter 5 names.
        // Take each name and store all the names into an array. Print the array

        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many name you want");
        int size =input.nextInt();
        input.nextLine();
        String[]names=new String[size];

        for(int i =0;i<names.length;i++){
            System.out.println("Enter name "+(i+1));
            names[i]=input.nextLine();
        }

        System.out.println(Arrays.toString(names));
    }
}
