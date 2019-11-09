package Array;

import java.util.Arrays;

public class OldArrayNewArray {
    public static void main(String[] args) {
        //Given an array with values of: 1,2,-3,4,-34,55,78,90,33,10
        //Take our all the even numbers from the array and put them into a new array. Print the new array
        int [] arr = {1,2,-3,4,-34,55,78,90,33,10};
        int count = 0;
        for(int i= 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                count++;
            }
        }
        int [] evenNumbers = new int[count];
        for(int i=0, j=0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evenNumbers[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(evenNumbers));
    }
}
