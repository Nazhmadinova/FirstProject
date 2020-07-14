package IntervewTasks;

import java.util.ArrayList;
import java.util.List;

public class DoesNotOccurInArray {

    //Write a function:
    //class Solution { public int solution(int[] A); }
    //that, given an array A of N integers,
    // returns the smallest positive integer (greater than 0) that does not occur in A.
    //For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
    //Given A = [1, 2, 3], the function should return 4.
    //Given A = [−1, −3], the function should return 1.
    //Write an efficient algorithm for the following assumptions:
    //N is an integer within the range [1..100,000];
    //each element of array A is an integer within the range [−1,000,000..1,000,000].

    public int solution(int[] A) {
        // write your code in Java SE 11

        List <Integer> list = new ArrayList<>();
        boolean cheak = false;

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++){
            if(max < A[i]){
                max = A[i];
            }
            if(A[i] > 0){
                cheak = true;
            }
        }

        if(!cheak){
            list.add(1);
        }

        for(int i = 1; i <= max + 1; i++){
            boolean check = true;
            for(int j = 0; j < A.length; j ++){
                if(i == A[j]){
                    check = false;
                }
            }

            if(check){
                list.add(i);
            }
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list.size(); i++){
            if(min > list.get(i)){
                min = list.get(i);
            }
        }
        return min;
    }

}
