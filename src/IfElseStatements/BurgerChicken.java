package IfElseStatements;

import java.util.Scanner;

public class BurgerChicken {
    public static void main(String[] args) {
//        a fast food company has two main order types, burger meal and chicken meal.
//        both have the same prices.
//                so if a cashier enters "burger" or "chicken " he will get the same price
//
//        a float : 10.0
//
//        this test can be done with one if.
//
//        check if in (string variable) equals "burger" or "chicken"  and output the price 10.0
//
//        also if input is "soda" output 2.0 (do this with another if)

        Scanner s = new Scanner(System.in);
        float price=10f;
        float sodaPrice=2f;

        String in = s.next();
        if (in.equals("burger") || in.equals("chicken")){
            System.out.println(price);
        }else if (in.equals("soda")){
            System.out.println(sodaPrice);
        }
    }
}
