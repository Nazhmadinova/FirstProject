package IfElseStatements;

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
//        using an if statement check which int is bigger a or b, and then output:
//        "number(a or b) is bigger".
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (a>b){
            System.out.println(a +" is bigger");
        }
        else{
            System.out.println(b +" is bigger");
        }
    }
}
