package IntervewTasks;

import java.util.Arrays;

public class SplitNumbersToArray {

    //Given an array of integers, take the non-negative element values and combine them
    // into one whole number. Add the given second value and return an array of the
    // resulting number with each digit as an element

    //Ex:
    //Input: int [] arr =[1,2,0,0] , int num = 30
    //            1200 + 30 = 1230


    public int[] addToArray(int addNum, int [] nums){

        String strNum = Arrays.toString(nums);
        strNum = strNum.substring(1, strNum.length()-1);
        strNum = strNum.replace(",","").replace(" ","");

        int num = Integer.parseInt(strNum) + addNum;
        strNum = String.valueOf(num);
        int [] newArr = new int[strNum.length()];

        for(int i = 0; i < newArr.length; i++){
            newArr[i] = Integer.parseInt(strNum.charAt(i) + "");
        }

        return newArr;
    }

    public static void main(String[] args) {

    }

}
