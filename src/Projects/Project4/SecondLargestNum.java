package Projects.Project4;

public class SecondLargestNum {
    //The method takes an integer of array as an argument and returns second largest number from that array.
    //( Attention! Don't use Arrays.sort() method. if you use ready method, you will get ZERO point)
    //
    //Example:
    //
    //argument: {12, 23, 3, 5, 89} => array
    //return : 23

    public static int secondLargestNum(int ... arr) {

        int [] ar = new int [arr.length];
        int secondLargest = arr[0];
        int largest = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(arr[i] > largest){
                secondLargest = largest;
                largest= arr[i];

                //If arr[i] is in between first and second then update second
            }else if(arr[i]> secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }


        }
        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println(secondLargestNum(12,1,12,60,90));
    }
}
