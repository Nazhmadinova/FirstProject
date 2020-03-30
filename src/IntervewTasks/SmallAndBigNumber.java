package IntervewTasks;

public class SmallAndBigNumber {

    public static void main(String[] args) {

       maxMinNumbers(-2,1,4,19,3);

    }


    public static void maxMinNumbers(int ... arr){

//        int big = Integer.MIN_VALUE;
//        int small = Integer.MAX_VALUE;
        int min = arr[0];
        int max = arr[0];

        for(int num: arr){

            if(min > num){
                min = num;
            }
            if(max < num){
                max = num;
            }
        }

        System.out.println(min + " " + max);

    }

}
