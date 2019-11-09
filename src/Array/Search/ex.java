package Array.Search;

import java.util.Arrays;

public class ex {
    public static void main(String[] args) {
        int []nums ={2,5,7,14};
        System.out.println("Index of 1 is "+ Arrays.binarySearch(nums,1));
        System.out.println("Index of 2 is "+ Arrays.binarySearch(nums,2));
        System.out.println("Index of 7 is "+ Arrays.binarySearch(nums,7));
        System.out.println("Index of 9 is "+ Arrays.binarySearch(nums,9));
        System.out.println("Index of 10 is "+ Arrays.binarySearch(nums,10));
        System.out.println("Index of 15 is "+ Arrays.binarySearch(nums,15));
        System.out.println("Index of 60 is "+ Arrays.binarySearch(nums,60));
    }
}
