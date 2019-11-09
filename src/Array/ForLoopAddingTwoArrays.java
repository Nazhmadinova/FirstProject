package Array;

import java.util.Arrays;

public class ForLoopAddingTwoArrays {
    public static void main(String[] args) {
        //Given you have two arrays with values of:
        //    3,2,6,43,7,20      and
        //    2,7,-10,10,-5,2
        //    Write a program that adds each element and stores them into a new array. Print the final array

        int [] numbers1={3,2,6,43,7,20};
        int [] numbers2={2,7,-10,10,-5,2};
        int [] newNumbers= new int[6];

        for(int i =0;i<newNumbers.length;i++){
            newNumbers[i]=numbers1[i]+numbers2[i];
        }
        System.out.println(Arrays.toString(newNumbers));

    }
}
