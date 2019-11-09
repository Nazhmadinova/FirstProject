package ReturnMethods;

public class CountEvenNums {
    //Create a method that will count how many even numbers there is from the given array and return the value
    public static int even(int [] nums){
        int count=0;
        for(int num: nums){
            if(num%2==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,6};
        System.out.println(even(nums));
    }
}
