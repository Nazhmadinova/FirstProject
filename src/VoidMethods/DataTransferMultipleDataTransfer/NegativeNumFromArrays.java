package VoidMethods.DataTransferMultipleDataTransfer;

public class NegativeNumFromArrays {
    // Create a method that will print negative numbers from a given int array

    public static void main(String[] args) {
        int [] nume={-1,3,-4,-2,32,2,-23,1};
        numbers(nume); //you can change the array name
    }

    public static void numbers(int[] nums){ //(int ... nums)=>numbers(...nums:1,2,3,4,5);
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                System.out.println(nums[i]);
            }
        }
    }
}
