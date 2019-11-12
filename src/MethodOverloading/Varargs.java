package MethodOverloading;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrr(1,1,2,3,4)));
    }
    public static int[] arrr(int num, int ... arr){
      for(int i=0;i<arr.length;i++){
         arr[i]=arr[i]+num;
      }
      return arr;
    }
}
