package Array;

import java.util.Arrays;

public class NewArrayWithEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, -34, 55, 78, 90, 33, 10};
        int count = 0;
        int [] evenArr;

        for(int array: arr){
            if(array%2==0){
                count++;
            }
        }

        evenArr=new int[count];
        int j=0;
        for(int array: arr){
            if(array %2==0){
                evenArr[j]=array;
                j++;
            }
        }
        System.out.println(Arrays.toString(evenArr));


    }
}
