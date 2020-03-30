package IntervewTasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SecondMaxNumber {
    // Create a method that will accept an int array.
    // Return the number which is the second to biggest number.
    // /** Do not use sort method **
    // Ex:
    // > input: 1,3,22,44,12,30,32,54,31
    // > output: 44

    public static int secondMaxNumber(int ... arr) {
        int max = arr[0];
        int second = arr[0];
        for(int i=1; i < arr.length; i++) {
            if(arr[i] > max) {
                second = max;
                max = arr[i];
            }
            else if(arr[i] > second) {
                second = arr[i];
            }
        }

        return second;
    }

    public static void main(String[] args) {
        System.out.println(secondMaxNumber(2,3,1,4,5));
    }
}
