package CodingBat.Array2;

import org.w3c.dom.ls.LSOutput;

public class IsEveryWhere {
    //We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array,
    // at least one of the pair is that value. Return true if the given value is everywhere in the array.
    //
    //isEverywhere([1, 2, 1, 3], 1) → true
    //isEverywhere([1, 2, 1, 3], 2) → false
    //isEverywhere([1, 2, 1, 3, 4], 1) → false
    public static boolean isEverywhere(int val, int ... nums) {
        for(int i = 0; i < nums.length; i++){
            if(i+1 < nums.length && nums[i] != val && nums[i+1] != val){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isEverywhere(1, 2, 1, 2, 2));
    }
}
