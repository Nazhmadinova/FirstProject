package CodingBat.Array2;

public class SameEnds {
    //Return true if the group of N numbers at the start and end of the array are the same.
    // For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3.
    // You may assume that n is in the range 0..nums.length inclusive.
    //
    //sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
    //sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
    //sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
    public static boolean sameEnds(int len, int ... nums) {
        int count=0;
        for(int i=0; i<len; i++){
            if(nums[i]==nums[nums.length-len+i])
                count++;
        }
        if(count==len){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(sameEnds(3,5,13,4,1,2,5,13,4));
    }
}
