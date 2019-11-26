package Array;

import java.util.Arrays;

public class ArraysCopyOfMethod {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};
        arr= Arrays.copyOf(arr,7);
        arr[5]=6;
        arr[6]=7;
        System.out.println(Arrays.toString(arr));
    }
}
