package Array;

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
}
