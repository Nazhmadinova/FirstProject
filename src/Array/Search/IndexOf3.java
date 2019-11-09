package Array.Search;

import java.util.Arrays;

public class IndexOf3 {
    public static void main(String[] args) {
        //1. declare array and store elements
        //{45,23,6,-3,66}
        //2. print out the index of -3 if it exists in the array.
        int [] nums={45,23,6,-3,66};
        Arrays.sort(nums);
        System.out.println("Index of -3 "+Arrays.binarySearch(nums,-3));
    }
}
