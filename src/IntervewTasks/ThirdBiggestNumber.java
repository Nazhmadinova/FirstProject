package IntervewTasks;

public class ThirdBiggestNumber {
    public static int sm(int ... arr){

        int min = arr[0];
        //int min = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }

        int max = min;
        int second = min;
        int third = min;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                third = second;
                second = max;
                max = arr[i];
            }
            else if(arr[i] > second){
                third = second;
                second = arr[i];
            }

            else if(arr[i] > third){
                third = arr[i];
            }
        }

        return third;
    }

    public static void main(String[] args) {
        System.out.println(sm(11,6,4,3,5,1,7,0,10));
    }
}
