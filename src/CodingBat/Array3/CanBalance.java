package CodingBat.Array3;

public class CanBalance {
    //Given a non-empty array, return true if there is a place to split the array so that the
    // sum of the numbers on one side is equal to the sum of the numbers on the other side.
    //
    //canBalance([1, 1, 1, 2, 1]) → true
    //canBalance([2, 1, 1, 2, 1]) → false
    //canBalance([10, 10]) → true

    public boolean canBalance(int[] nums) {
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            right += nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                left += nums[j];
            }
            if (right == left) return true;
        }
        return false;
    }
}
