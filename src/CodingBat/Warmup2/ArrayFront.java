package CodingBat.Warmup2;

public class ArrayFront {
    //Given an array of ints, return true if one of the first 4 elements in the array is a 9.
    // The array length may be less than 4.
    //
    //arrayFront9([1, 2, 9, 3, 4]) → true
    //arrayFront9([1, 2, 3, 4, 9]) → false
    //arrayFront9([1, 2, 3, 4, 5]) → false
    public boolean arrayFront9(int[] nums)
    {
        int len = nums.length;
        int count = 0;
        if(len > 4)
            len = 4;
        for(int i = 0; i < len; i++)
        {
            if(nums[i] == 9)
                return true;
        }
        return false;
    }

    //other way
    //public boolean arrayFront9(int[] nums) {
    //  int i = 0;
    //
    //    while(i < nums.length && i < 4) {
    //        if(nums[i] == 9)
    //            return true;
    //
    //        i++;
    //    }
    //
    //    return false;
    //}
}
