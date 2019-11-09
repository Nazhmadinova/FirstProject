package Replit.Loop;

import java.util.Scanner;

public class ForLoopSum1DivN {
    public static void main(String[] args) {
        //Write a program to calculate the sum of following series where n is input by user.
        //1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        double sum=0.0;
        for( double i=1;i<=n;i++){
            sum+=1/i;
        }
        System.out.println(sum);

    }
}
