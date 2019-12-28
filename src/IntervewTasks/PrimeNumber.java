package IntervewTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
    //Create a method that will accept a number (int).
    // Return an ArrayList of all the numbers that are prime numbers in the range
    // of 1 to the given number
    // Hint: make a helper method first, isPrime
    // Ex:
    // > input: 50
    // > output: [1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47]

    public static void main(String[] args) {
        System.out.println(primeNumbers(50));
    }

    public static ArrayList<Integer> primeNumbers(int num){

        ArrayList<Integer> list =  new ArrayList<>();

        for(int i = 1; i <= num; i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }


    public static boolean isPrime(int num){
        boolean check = true;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                check = false;
            }
        }
        return check;
    }
}
