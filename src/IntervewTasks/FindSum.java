package IntervewTasks;

import java.util.HashMap;
import java.util.Map;

public class FindSum {

    /* Find the sum of all highest occurring elements in an Array
Given an array of integers containing duplicate elements. The task is to find the sum of all
highest occurring elements in the given array. That is the sum of all such elements whose
frequency is maximum in the array.

Examples:

Input : arr[] = {1, 1, 2, 2, 2, 2, 3, 3, 3, 3}
Output : 20
The highest occurring elements are 3 and 2 and their
frequency is 4. Therefore sum of all 3's and 2's in the
array = 3+3+3+3+2+2+2+2 = 20.

Input : arr[] = {10, 20, 30, 40, 40}
Output : 80*/

    public static int sum(int ... arr ){
        Map<Integer, Integer> numbers = new HashMap<>();
        int sum = 0;
        for(int key: arr){
            if(!numbers.containsKey(key)){
                numbers.put(key, 1);
            }else{
                numbers.put(key, numbers.get(key) + 1);
            }
        }

        int max = Integer.MIN_VALUE;

        for(Integer key: numbers.keySet()){
            if(max < numbers.get(key)){
                max = numbers.get(key);
            }
        }

        for(Integer key: numbers.keySet()){
            if(numbers.get(key) == max){
                sum += (key * numbers.get(key));
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        System.out.println(sum(1, 1, 2, 2, 2, 2, 3, 3, 3, 3));
    }

}
