package Array;

public class IntEveryOtherElem {

        public static boolean result(int[] arr, int num){
           for(int i = 0; i < arr.length-1; i++){
               if(arr[i] != num && arr[i+1] != num){
                   return false;
               }
           }
           return true;
        }

    public static void main(String[] args) {
        int [] arr ={2,0,2,2,0};
        System.out.println(result(arr, 2));
    }

}
