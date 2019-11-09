package Projects.Project3;

import java.util.Arrays;

public class Task5NumbersAppearOnce {
    public static void main(String[] args) {
        //Create and array of integer and store following numbers [5, 7, 8, 8, 11, 55, 23, 23, 23, 54, 7, 1, 2, 2]
        //Using a nested loop print only values that appear once(true meaning of unique):
        //
        //Output: 5 11 55 54 1

        int [] arr={5, 7, 8, 8, 11, 55, 23, 23, 23, 54, 7, 1, 2, 2};
        String result="";


        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                result+=" "+arr[i];
            }
        }
        result=result.trim();
        System.out.println(result);




//        If we want unique numbers:
//        Arrays.sort(arr);
//
//        for(int i =0;i<arr.length-1;i++) {
//            if(arr[i]!=arr[i+1]){
//                System.out.println(arr[i]);
//            }
//        }
    }
}
