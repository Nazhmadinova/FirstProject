package IfElseStatements;

import java.util.Scanner;

public class NumberPositiveNegativeEqualsToZero {
    public static void main(String[] args) {
//        you need to check if "a" is positive negative or equals to zero.
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if(a>0){
            System.out.println("positive");
        }
        else if(a<0){
            System.out.println("negative");
        }
        else if(a==0){
            System.out.println("zero");
        }
    }
}
