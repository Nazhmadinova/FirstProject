package VoidMethods.DataTransferMultipleDataTransfer;

import java.util.Arrays;

public class StringSeparetadeByInt {
    //Write a method that will take a String of numbers (9843263 for example) and an int.
    // Add that second given number to each other number and show each operation
    // result as separate elements of an int array

    public static void main(String[] args) {
        addNumber("9843263",1);

    }
    public static void addNumber(String num, int number){

       String [] newStr=num.split("");

        int [] nums=new int[newStr.length];
        int j=0;
        for(int i=0;i<newStr.length;i++){
            nums[j]=Integer.valueOf(newStr[i]);
            j++;
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]+number;
        }
        System.out.println(Arrays.toString(nums));

    }
    //other way
    //public static void main(String[] args) {
    //        addNumToString("9843263", 5);
    //    }
    //    public static void addNumToString(String number, int add) {
    //        // 9 8 4 3 2 6 3, 1
    //        String [] nums = number.split("");
    //        int [] intArray = new int[nums.length];
    //        for(int i=0; i < nums.length; i++) {
    //            intArray[i] = Integer.valueOf(nums[i]) + add;
    //        }
    //        System.out.println(Arrays.toString(intArray));
    //    }
}
