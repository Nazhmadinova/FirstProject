package IntervewTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    //Create a method that will accept an int array.
    // Return an int array with only unique values.
    // If there is a duplicate element, only include one instance of that element.
    // Ex:
    // > input: 2,3,1,1,3,5,2,6,4
    // > output: [2, 3, 1, 5, 6, 4]
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicate(2,3,1,1,3,5,2,6,4)));
    }

    public static int [] removeDuplicate(int ... arr) {
        ArrayList<Integer> unique = new ArrayList<>();
        for(int i=0; i < arr.length; i++) {
            if(!unique.contains(arr[i])) {
                unique.add(arr[i]);
            }
        }

        return convertArray(unique.toArray());
    }
    private static int [] convertArray(Object [] arr) {
        int [] nums = new int[arr.length];
        for(int i=0; i < arr.length; i++) {
            nums[i] = (int) arr[i];
        }
        return nums;
    }

//    public static int [] removeDuplicate(int ... arr) {
//        ArrayList<Integer> unique = new ArrayList<>();
//        for(int i=0; i < arr.length; i++) {
//            if(!unique.contains(arr[i])) {
//                unique.add(arr[i]);
//            }
//        }
//        int [] numbers = new int[unique.size()];
//        for(int i = 0; i < numbers.length; i++){
//            numbers[i] = unique.get(i);
//        }
//        return numbers;
//    }

}
