package Exceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Phone {
//Task: Make a class for Phone with instance variables of version, brand, contacts
//Ask the user to enter their phone information.
//version (double)
//brand (String)
//contacts (int [] of -> numbers)
//    -> ask the user how many numbers they want to add, and allow them to add that many
    double version;
    String brand;
    int [] numbers;

    Phone(){
        Scanner input = new Scanner(System.in);


            System.out.println("Enter phone brand:");
            brand = input.nextLine();

        try {
            System.out.println("Enter phone version:");
            version = input.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Invalid version");
        }

//        numbers = new int [11];
//        for(int i = 0; i < numbers.length; i++ ){
//
//            try{
//                System.out.println("Enter a number");
//                numbers[i] = input.nextInt();
//            }catch (InputMismatchException e){
//                System.out.println(e.toString());
//                break;
//            }
//
//        }

        // or for number other way
        try{
            System.out.println("Enter how many digits:");
            numbers = new int [input.nextInt()];

            for(int i = 0; i < numbers.length; i++){
                try{
                    System.out.println("Enter number "+(i+1));
                    numbers[i] = input.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("Invalid number ");
                    break;
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Incorrect number");
        }

    }

    void info(){
        System.out.println("Version: " + version);
        System.out.println("Brand: " + brand);
        System.out.println("Phone number: " + Arrays.toString(numbers));
    }

    public static void main(String[] args) {

        Phone phone = new Phone();
        phone.info();

    }
}
