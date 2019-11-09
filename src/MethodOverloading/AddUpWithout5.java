package MethodOverloading;

public class AddUpWithout5 {
    //Create a method that will accept an int array.
    // Add up all the numbers in your array, except for numbers that end with 5.

    //Overload your method to take an int array and a number. Now return the sum of all the numbers,
    // except for the numbers that end with the given number.

    public static int total(int ... arr){
        int tot=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]%10)!=5){
                tot+=arr[i];
            }
        }
        return tot;
    }
    public static int total( int [] arr, int num){
        int tot=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]%10)!=num){
                tot+=arr[i];
            }
        }
        return tot;
    }

    public static void main(String[] args) {
        System.out.println(total(2,1,1,1));
        int [] arr={1,3,2,14,24};
        System.out.println(total(arr,4));

    }
    //other way
    //int sum = 0;
    //for(int num: arr) {
    //            String s = num + "";
    //            if(s.endsWith("5")) {
    //                continue;
    //            }
    //            sum += num;

    //int sum = 0;
    // for(int num: arr) {
    //            String s = num + "";
    //            if(!s.endsWith(number + "")) {
    //                sum += num;
    //            }


}
