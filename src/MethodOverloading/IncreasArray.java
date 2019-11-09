package MethodOverloading;

import java.util.Arrays;

public class IncreasArray {
    //Old tasks: Create a method that will take a String array and a String.
    // Increase your array capacity and add the given String as the last element of the new array. Return the new array

    //New task: Overload the pervious method to take a String array,
    // a String to add to the array, and number position where the new element should be added

    public static String [] increaseArray(String [] arr, String word) {
        String [] newArr = new String[arr.length + 1];
        for(int i=0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = word;
        return newArr;
    }

    public static String [] increaseArray(String [] arr, String word, int index) {
        String [] newArr = new String[arr.length + 1];
        for(int i=0, j=0; j < newArr.length;j++) {
            if(index==j){
                newArr[j]=word;
            }else{
                newArr[j]=arr[i];
                i++;
            }

        }

        return newArr;
    }

    public static void main(String[] args) {
        String []arr={"a","b","c"};
        String word ="d";
        System.out.println(Arrays.toString(increaseArray(arr,word,1)));
    }

}
