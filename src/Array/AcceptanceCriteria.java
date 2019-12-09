package Array;

import java.util.Arrays;
import java.util.Scanner;

public class AcceptanceCriteria {
    public static void main(String[] args) {
  //      Scanner input =new Scanner(System.in);
//        System.out.println("Enter array size:");
//        int size = input.nextInt();
//        int [] arr = new int[size];
//        for(int i = 0; i < size; i++){
//            System.out.println("Enter array element #"+(i+1));
//            arr[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,0,arr.length/2)));
//        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,arr.length/2,arr.length)));

        String str = "We went to picnic today";
        char [] arr2 = str.toCharArray();
        for(int i = 0; i < arr2.length/2; i++){
            char temp = arr2[i];
            arr2[i] = arr2[arr2.length-1-i];
            arr2[arr2.length-i-1] = temp;
        }

        String rev = "";
        for(int i = 0; i <arr2.length; i++){
            rev+=arr2[i];
        }
        System.out.println(rev);

//        String str = "We went to picnic today";
//        String [] arr = str.split(" ");
//
//        String rev = "";
//
//        for(int i = 0; i < arr.length; i++){
//            for(int j = arr[i].length()-1; j >= 0; j--){
//                rev = rev + arr[i].charAt(j);
//            }
//            rev+=" ";
//        }
//        System.out.println(rev);
    }
}
