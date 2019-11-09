package ReturnMethods;

import java.util.Arrays;

public class IncreasArray {
    //Create a method that will take a String array and a String.
    // Increase your array capacity and add the given String as the last element of the new array. Return the new array

    public static String[] increaseArr(String[]arr,String word){
        arr= Arrays.copyOf(arr,arr.length+1);
        arr[arr.length-1]=word;
        return arr;
    }

    public static void main(String[] args) {
        String []arr={"a","b","c"};
        String word ="d";
        System.out.println(Arrays.toString(increaseArr(arr,word)));
    }
    //other way
    public static String [] increaseArray(String [] arr, String word) {
        String [] newArr = new String[arr.length + 1];
        for(int i=0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = word;
        return newArr;
    }

}
