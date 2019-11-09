package Replit.Array;

import java.util.Scanner;

public class FromBinaryToDecimal {
    public static void main(String[] args) {
        //Given an array binary with 8 integers (0s or 1s),
        // write java program to calculate decimal value and print out to console.

        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for(int i =0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }

        int res = 0;
        int check = 128;

        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == 1) {
                res += check;
            }

            check /= 2;
        }

        System.out.println(res);
    }
}
