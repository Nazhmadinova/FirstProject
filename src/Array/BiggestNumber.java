package Array;

public class BiggestNumber {
    public static void main(String[] args) {
        //Given numbers of 3,30,14,6,50,20
        //Find and print the biggest number
        int[]arr ={3,30,14,6,50,20};
        int max=arr[0];
        for(int i=1;i<6;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
