package Array;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        //Create an array with 50 random numbers in the range of 1-100. Then print the array
        Random random = new Random();
        int []numbers=new int[50];
        for(int i=0;i<50;i++){
            numbers[i]=random.nextInt(100)+1;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
