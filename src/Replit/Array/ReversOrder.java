package Replit.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReversOrder {
    public static void main(String[] args) {
        //Given an array nums with 7 integers already assigned, write code to reverse it.
        //nums -> [4, 3, 2, 44, 1, 100, 55]
        //change it to:
        //nums -> [55, 100, 1, 44, 2, 3, 4]
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt(),input.nextInt()};

        int[] num=new int[7];
        int j=0;
        for(int i=nums.length-1;i>=0;i--){
            num[j++]=nums[i];
        }
        System.out.println(Arrays.toString(num));
        //Other way
        //for (int i = 0; i < nums.length / 2; i++) {
        //  int temp = nums[i];
        //  nums[i] = nums[nums.length - 1 - i];
        //  nums[nums.length - 1 - i] = temp;
        //}
        //    System.out.println(Arrays.toString(nums));

    }
}
