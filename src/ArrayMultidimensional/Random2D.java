package ArrayMultidimensional;

import java.util.Arrays;
import java.util.Random;

public class Random2D {
    //Create a method that will generate a random 2D int array.
    // Take two parameters. The first one for how many 1D arrays you want,
    // and second how many elements each 1D array should have
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generate(2,4)));

    }

    public static int [][] generate(int arr, int elem){
        Random random = new Random();
        int[][] newArr=new int[arr][elem];
        for(int i=0;i<arr;i++){
            for(int j=0;j<elem;j++){
                newArr[i][j]=random.nextInt(100);
            }
        }
         return newArr;
    }
}
