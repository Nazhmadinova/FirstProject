package Loop;

import java.util.Scanner;

public class ForLoopName {
    public static void main(String[] args) {
        //Write a program that asks from 5 names from the user and print each name.
        //Flow:
        //Please enter name1:
        //> Adam
        //Adam
        //Please enter name2:
        //> Jamie
        //Jamie
        //Please enter name3:
        //> John
        //John
        Scanner input = new Scanner(System.in);
       for(int i = 1; i<=5; i++) {
           System.out.println("Please enter name"+i+":");
           String name = input.nextLine();
           System.out.println(name);
       }
    }
}
