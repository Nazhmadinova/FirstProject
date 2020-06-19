package Exceptions;

import java.util.Scanner;

public class FinallyEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println(3/4);
            System.out.println(new int [] {2,3}[6]);
        }//catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("array");
//        }
        catch (ArithmeticException e){
            System.out.println("Don't divide by 0");
        }finally {
            System.out.println("Java is almost done");
            input.close();
            //int n = input.nextInt(); // runtime exception
        }
        System.out.println("hii");

    }
}
