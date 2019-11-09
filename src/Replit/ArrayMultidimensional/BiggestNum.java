package Replit.ArrayMultidimensional;

import java.util.Scanner;

public class BiggestNum {
    public static void main(String[] args) {
        //Given a 2d array of ints, find the biggest number(int) in the array and print it.
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }
        }

        int max=arr[0][0];;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
