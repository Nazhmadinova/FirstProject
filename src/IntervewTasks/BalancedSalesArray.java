package IntervewTasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class BalancedSalesArray {


    static int findElement(int arr[], int n)
    {
        // Forming prefix sum array from 0
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++)
            prefixSum[i] = prefixSum[i - 1] + arr[i];

        // Forming suffix sum array from n-1
        int[] suffixSum = new int[n];
        suffixSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            suffixSum[i] = suffixSum[i + 1] + arr[i];

        System.out.println(Arrays.toString(prefixSum));
        System.out.println(Arrays.toString(suffixSum));
        // Find the point where prefix and suffix
        // sums are same.
        for (int i = 1; i < n - 1; i++)
            if (prefixSum[i] == suffixSum[i])
                return i;

        return -1;
    }

    public static int balancedSum(List<Integer> sales){
        int [] arr = new int [sales.size()];

        for(int i = 0; i < sales.size(); i++){
            arr[i] = sales.get(i);
        }
            int[] leftSum = new int[arr.length];
            leftSum[0] = arr[0];
            for (int i = 1; i < arr.length; i++)
                leftSum[i] = leftSum[i - 1] + arr[i];


            int[] rightSum = new int[arr.length];
            rightSum[arr.length - 1] = arr[arr.length - 1];
            for (int i = arr.length - 2; i >= 0; i--)
                rightSum[i] = rightSum[i + 1] + arr[i];

            for (int i = 1; i < arr.length - 1; i++)
                if (leftSum[i] == rightSum[i])
                    return i;

            return -1;

    }

    static int findElement2(int arr[], int size)
    {
        int right_sum = 0, left_sum = 0;

        // Computing right_sum
        for (int i = 1; i < size; i++)
            right_sum += arr[i];

        // Checking the point of partition
        // i.e. left_Sum == right_sum
        for (int i = 0, j = 1; j < size; i++, j++) {
            right_sum -= arr[j];
            left_sum += arr[i];

            if (left_sum == right_sum)
                return i + 1;
        }

        return -1;
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 2,3,4,1,4,5};
        int n = arr.length;
        System.out.println(findElement(arr, n));


    }

}


