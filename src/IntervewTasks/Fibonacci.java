package IntervewTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    //Fibonacci Create a method that will accept a number (int).
    // Return a String with each Fibonacci number separated by a space.
    // The amount of Fibonacci numbers in the String is determined by the given number
    // Ex:
    // > input: 10
    // > output: 0 1 1 2 3 5 8 13 21 34

    public static String fibonacci(int num){
//        String numbers = "";
//        int t1 = 0;
//        int t2 = 1;
//
//        for(int i = 0; i < num; i++){
//            numbers += (t1 + " ");
//            int sum =  t1 + t2;
//            t1 = t2;
//            t2 = sum;
//        }
//        return numbers;

        //other way
        int [] arr = new int [num];
        arr [0] = 0;
        arr [1] = 1;

        for(int i = 2; i < arr.length; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        String str = Arrays.toString(arr);

        return str.substring(1,str.length()-1).replace(",","");

    }



    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
