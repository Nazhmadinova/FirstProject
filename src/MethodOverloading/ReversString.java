package MethodOverloading;

import java.util.Arrays;

public class ReversString {
    //We have a method that reverses a String, overload it to accept an int array and reverse the elements in the array.
    // Return the reversed array. Also over load the method to accept a String array and reverse the elements in that array.
    // Return the reserved array.
    public static void main(String[] args) {
        String [] arr={"a","b","c","d"};
        int[] arR={1,2,3,4};
        System.out.println(Arrays.toString(revers(arr)));
        System.out.println(Arrays.toString(revers(arR)));


    }

    public static String revers(String word){
        String rev="";
        for(int i=word.length()-1;i>=0;i--){
            rev+=""+word.charAt(i);
        }
        return rev;
    }
    public static String [] revers(String[]arr){
        for(int i=0; i<arr.length/2;i++){
            String temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }
    public static int [] revers(int []arr){
        for(int i=0; i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }




}

//
//    public static void main(String[] args) {
//        String [] arr={"a","b","c","d"};
//        int[] arR={1,2,3,4};
//        revers(arr);
//        revers(arR);
//
//    }
//    public static void revers(String word){
//        String rev="";
//        for(int i=word.length()-1;i>=0;i--){
//            rev+=""+word.charAt(i);
//        }
//
//    }
//    public static void revers(String[]arr){
//        for(int i=0; i<arr.length/2;i++){
//            String temp=arr[i];
//            arr[i]=arr[arr.length-1-i];
//            arr[arr.length-1-i]=temp;
//        }
//        System.out.println(Arrays.toString(arr));
//
//    }
//    public static void revers(int []arr){
//        for(int i=0; i<arr.length/2;i++){
//            int temp=arr[i];
//            arr[i]=arr[arr.length-1-i];
//            arr[arr.length-1-i]=temp;
//        }
//        System.out.println(Arrays.toString(arr));
//
//    }

