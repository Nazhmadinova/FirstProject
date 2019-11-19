package Projects.Project4;

import java.util.Arrays;

public class ExtractNum {
    //The method takes, str , (str may contain characters, numbers and special characters)
    // and return integer of array. The Implementation of method is that separates the number
    // from str and store in array then return that array.
    //array needs to be exact size of element
    //
    //extractNum("aa2aa3") ==> [2, 3]
    //extractNum("aa2") ==> [2]
    //extractNum("aa10aa") ==> [1, 0]
    //extractNum("aa!!%$#.10aa") ==> [1, 0]

    public static int[] extractNum(String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=48 && str.charAt(i)<=57){
                newStr+=str.charAt(i);

            }
        }
        String [] arr=newStr.split("");
        int [] numArr=new int[arr.length];

        for(int i=0;i<numArr.length;i++){
            numArr[i]=Integer.valueOf(arr[i]);
        }
        return numArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(extractNum("aa2 1aa3")));
    }

}
