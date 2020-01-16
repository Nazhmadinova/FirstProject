package IntervewTasks;

import java.util.ArrayList;

public class MissingNumber {



    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,10};

        for(int i = 0; i < 10; i++){
            boolean b = false;
           for(int j = 0; j < arr.length; j++){

               if(arr[j] == i){
                   b=true;
               }

           }

           if(b == false){
               System.out.println("Missing number: "+i);
           }
        }
    }

    public static int[] missingNumber(int ... numbers){

        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
        }

        ArrayList<Integer> missing = new ArrayList<>();

        for(int i = 0; i < max; i ++){
            boolean check = false;
            for(int j = 0; j < numbers.length; j++){
                if(numbers[j] == i){
                    check = true;
                }
            }

            if(!check){
                missing.add(i);
            }
        }

        int [] arr = new int[missing.size()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = missing.get(i);
        }
        return arr;
    }
}
