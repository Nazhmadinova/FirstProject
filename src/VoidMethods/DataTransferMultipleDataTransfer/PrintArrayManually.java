package VoidMethods.DataTransferMultipleDataTransfer;

public class PrintArrayManually {
    //Write a method that accepts an int array.
    // Print out the array using the same format as Arrays.toString method. DO NOT USE THE toString() METHOD.
    //[element, element, element]
    public static void main(String[] args) {
       manual(1,2,3,4,5);

    }
    public static void manual(int ... numbers){
        String str="";
        for(int i=0;i<numbers.length;i++){
            str+=" "+numbers[i];
        }
         str=str.trim();
        if(str.contains(" ")){
            str =str.replace(" ",", ");
        }
        System.out.println("["+str+"]");

        //Other way
        //String result = "[";
        //        for(int num : arr) {
        //            result += num + ", ";
        //        }
        //        result = result.substring(0,result.length()-2) + "]";
        //        System.out.println(result);

    }
}
