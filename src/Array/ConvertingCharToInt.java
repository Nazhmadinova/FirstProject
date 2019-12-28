package Array;

import java.util.Arrays;

public class ConvertingCharToInt {
    public static void main(String[] args) {
        String str = "123456";
        char [] arr = str.toCharArray();

        int [] number = new int [arr.length];

        for(int i = 0; i < arr.length; i++){
            number[i] =Integer.parseInt(String.valueOf(arr[i]));
        }

        System.out.println(Arrays.toString(number));
    }
}
