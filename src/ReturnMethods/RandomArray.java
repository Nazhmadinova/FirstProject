package ReturnMethods;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    //Create a method that will generate a random int array.
    // The method takes the size of the array and the bound of the random numbers. Return the random array
    public static int[] randomArr(int size,int bound){
        int []randomAr= new int[size];
        Random random = new Random();
        for(int i=0;i<randomAr.length;i++){

           randomAr[i] = random.nextInt(bound);
        }
        return randomAr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(randomArr(5,30)));
    }
}
