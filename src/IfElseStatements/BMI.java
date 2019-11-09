package IfElseStatements;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
//        BMI: Program will ask user to enter their mass (kilogram)
//        and their height (meter). Calculate their BMI
//        and then print the appropriate message based on the provided values:
//—> BMI Formula: BMI = mass / height^2
//—> Values:
//        Less than 18.5 — Underweight
//        From 18.5 to 25 — Normal weight
//        From 25 to 30 — Overweight
//        More than or equal to 30 — Obese

        Scanner input = new Scanner(System.in);
        double mass = input.nextDouble();
        double height = input.nextDouble();
        double BMI = mass/ (height*height);

        if (BMI<18.5){
            System.out.println("Underweight");
        }
        else if (BMI>=18.5 && BMI<25){
            System.out.println("Normal weight");
        }
        else if (BMI>=25 && BMI<30){
            System.out.println("Overweight");
        }
        else if (BMI>=30){
            System.out.println("Obese");
        }


    }
}
