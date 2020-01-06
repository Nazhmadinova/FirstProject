package Exceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayElem {
    public static void main(String[] args) {
        //Create an array with values {1,2,3,4,5}
        //Ask user to enter the index they want to change, and then the number they want to change that element to.
        //Case: User could enter an index that doesnt exist
        //Case: User could enter a character instead of the index they want to change or a
        // character instead of the number they want to change it to

        int [] arr = {1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        int index;
        int number;
        try{
            System.out.println("Enter index: ");
            index = scanner.nextInt();
            System.out.println("Enter number: ");
            number = scanner.nextInt();
            arr[index] = number;
        }catch (InputMismatchException e){
            System.out.println("It is not number");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("We don't have that index");
        }finally {
            System.out.println(Arrays.toString(arr));
        }

    }
}
