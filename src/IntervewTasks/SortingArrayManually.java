package IntervewTasks;

import java.util.Arrays;

public class SortingArrayManually {

        public static int[] sort(int ... array){
            int temp=0;
            for (int i=0; i < array.length; i++){
                for(int j = i+1; j < array.length; j++){
                    if(array[i] > array[j]){
                        temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
            }
            return  array;
        }

        public static void main(String[] args) {
            System.out.println(Arrays.toString(sort(5,9,3,10,1,0,11,6)));
        }
    }

