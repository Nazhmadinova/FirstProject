package Replit.ArrayMultidimensional;

import java.util.Arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        //2D array multiplicationTable declared with 10 rows and 10 columns.
        int [][] multiplicationTable = new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                multiplicationTable[i][j]=(i+1)*(j+1);
            }
        }

        System.out.println(Arrays.deepToString(multiplicationTable) ) ;
    }
}
