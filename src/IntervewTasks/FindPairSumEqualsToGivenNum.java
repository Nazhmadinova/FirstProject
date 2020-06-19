package IntervewTasks;

import java.util.ArrayList;
import java.util.Stack;

public class FindPairSumEqualsToGivenNum {

    public static boolean findPair(int sum, int ... nums){

        // time complexity is -> O(n) linear

        ArrayList<Integer> remain = new ArrayList<>();

        for(int num: nums){
            if(remain.contains(num)){
                return true;
            }
            remain.add(sum - num);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(findPair(8,1,2,3,9));
        System.out.println(findPair(8,1,2,4,2,3));
        System.out.println(findPair(8,1,2,3,6));
    }

    // if given array is sorted we can use below method:
    public static boolean findPair2(int sum, int ... nums){

        int low = 0;
        int high = nums.length - 1;

        while (low < high){
            int s = nums[low] + nums[high];
            if(s == sum){
                return true;
            }else if(s > sum){
                high--;
            }else{
                low++;
            }
        }

        return false;
    }

}
