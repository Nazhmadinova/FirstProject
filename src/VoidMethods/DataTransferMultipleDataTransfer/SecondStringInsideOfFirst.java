package VoidMethods.DataTransferMultipleDataTransfer;

import java.util.Scanner;

public class SecondStringInsideOfFirst {
    //Write a method that takes two Strings. Check if the second String is found inside of the first String.
    // If it does, remove that part from the String,
    // but if the second String is not in the first String ask the user to enter another String to try again.
    public static void main(String[] args) {
        contain("Gulzhaina","zhaina");
    }
    public static void contain(String first,String second){
        if(first.contains(second)){
            first=first.replace(second,"");
            System.out.println(first.trim());
        }else{
            System.out.println("Enter another String to try again");
            Scanner input =new Scanner(System.in);
            String str =input.nextLine();

            if(first.contains(str)){
                first=first.replace(str,"");
                System.out.println(first.trim());
            }else{
                System.out.println("Out of tries");
            }
        }
    }
}
