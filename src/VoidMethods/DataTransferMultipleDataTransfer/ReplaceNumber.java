package VoidMethods.DataTransferMultipleDataTransfer;

import java.util.Arrays;

public class ReplaceNumber {
    //Write a method accepts an int array and a number.
    // Replace any negative numbers in your array with the given number. Print the array
    public static void main(String[] args) {
        int [] nums={1,-1,2,-3,-5};

        replace(nums,0);
    }
    public static void replace(int [] nums, int number){
        for(int i=0;i<nums.length; i++){
            if(nums[i]<0){
                nums[i]=number;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
