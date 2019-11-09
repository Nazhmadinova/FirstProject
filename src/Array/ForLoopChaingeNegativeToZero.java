package Array;

import java.util.Arrays;

public class ForLoopChaingeNegativeToZero {
    public static void main(String[] args) {
        //Given numbers of 4,-2,5,-3,-20,30. Write a program that will change any negative number to be 0.
        // Print the changed array.
        int[] numbers={4,-2,5,-3,-20,30};
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<0){
                numbers[i]=0;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
