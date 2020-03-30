package IntervewTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class NestedArraylistAnagram {

    //Create a method that will accept a nested ArrayList of Strings and return the number of anagrams total.
    // Each ArrayList will have two elements.

    public static int numberOfAnagrams(ArrayList<ArrayList<String>> words){

        int count = 0;

        for(ArrayList<String> eachList: words){

            char [] firstStr = eachList.get(0).toCharArray();
            char [] secondStr = eachList.get(1).toCharArray();

            Arrays.sort(firstStr);
            Arrays.sort(secondStr);

            if(Arrays.equals(firstStr,secondStr)) count++;
        }

        return count;

    }

}
