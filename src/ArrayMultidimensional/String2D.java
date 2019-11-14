package ArrayMultidimensional;

import java.util.Arrays;

public class String2D {
    public static void main(String[] args) {
        //Create a 2D String array that will hold 3 groups.
        // Create three 1D arrays and initialize them with some group members names.
        // Store each 1D array into your 2D and print the 2D array at the end

        String [][] group=new String[3][];
        String[] arr1={"a","b","c"};
        String[] arr2={"d","e","f"};
        String[] arr3={"j","k","l"};
        group[0]=arr1;
        group[1]=arr2;
        group[2]=arr3;
        System.out.println(Arrays.deepToString(group));
    }
}
