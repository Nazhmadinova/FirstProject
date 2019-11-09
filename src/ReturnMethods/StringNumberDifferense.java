package ReturnMethods;

import java.util.Arrays;

public class StringNumberDifferense {
    //Given a String of numbers. Return the difference between the biggest and smallest number
    public static int diff(String number){
        String [] arr=number.split("");

        int [] newArr=new int[arr.length];
       for(int i =0; i<=arr.length-1;i++){
           newArr[i]=Integer.valueOf(arr[i]);
       }

        Arrays.sort(newArr);
       return newArr[newArr.length-1]-newArr[0];
    }

    public static void main(String[] args) {
        System.out.println(diff("8323234"));
    }
}
