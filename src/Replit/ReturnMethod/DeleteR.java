package Replit.ReturnMethod;

import java.util.Arrays;

public class DeleteR {
    //deleteR, gets an int array, and an int. the method returns an int array.
    //
    //It removes element int from the array.
    //
    //example use (pseudo code):
    //
    //deleteR([1,2,3],2)
    //returns [1,3]
    //
    //deleteR([19,99,9,9999],9)
    //returns [19,99,9999]
    //
    //deleteR([1,5,3,4],5)
    //returns [1,3,4]
    public static int[] deleteR(int[] arr,int element) {
        int[]deleted=new int[arr.length-1];
        int j=0;
        for(int i=0;i<deleted.length;i++){
            if(arr[j]==element){
                j++;
            }
            deleted[i]=arr[j];
            j++;
        }

        return deleted;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        System.out.println(Arrays.toString(deleteR(arr,4)));
    }
}
