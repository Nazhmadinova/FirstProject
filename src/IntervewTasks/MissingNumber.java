package IntervewTasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

        System.out.println(missingNumber(arr));
    }

    public static ArrayList<Integer> missingNumber(int ... numbers){

        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
        }

        ArrayList<Integer> missing = new ArrayList<>();

//        Map<Integer, Boolean> fullNumbers = new HashMap<>();
//        for(int i = 0; i <= max; i++){
//            fullNumbers.put(i, false);
//        }
//        for(int i = 0; i < numbers.length; i++){
//            if(fullNumbers.containsKey(numbers[i])){
//                fullNumbers.put(numbers[i],true);
//            }
//        }
//        for(Integer key: fullNumbers.keySet()){
//            if(!fullNumbers.get(key)){
//                missing.add(key);
//            }
//        }

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

        return missing;
    }
}
