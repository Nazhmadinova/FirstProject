package CodingBat.Array2;

public class Sum67 {
    //Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6
    // and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
    //
    //sum67([1, 2, 2]) → 5
    //sum67([1, 2, 2, 6, 99, 99, 7]) → 5
    //sum67([1, 1, 6, 7, 2]) → 4

    public int sum67(int[] nums) {
        int sum = 0;
        int number = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) number = 1;
            if (number == 0) sum+=nums[i];
            if (nums[i] == 7) number = 0;
        }
        return sum;

        //other way
        //public int sum67(int[] nums) {
        //  int sum = 0;
        //  boolean check=true;
        //  for (int i = 0; i < nums.length; i++) {
        //      if (nums[i] == 6){
        //      check=false;
        //      }
        //      if (check == true){
        //        sum+=nums[i];
        //      }
        //      if (nums[i] == 7){
        //        check = true;
        //      }
        //  }
        //   return sum;
        //}

    }
}
