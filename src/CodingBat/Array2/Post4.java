package CodingBat.Array2;

public class Post4 {
    public int[] post4(int[] nums) {
        int count=0;
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]==4){
                break;
            }else{
                count++;
            }
        }
        int[] arr=new int[count];
        for(int i=0;i<arr.length;i++){
            arr[i]=nums[nums.length-count+i];
        }
        return arr;
    }
}
