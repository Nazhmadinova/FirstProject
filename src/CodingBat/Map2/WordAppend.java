package CodingBat.Map2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {

    //Loop over the given array of strings to build a result string like this:
    // when a string appears the 2nd, 4th, 6th, etc. time in the array,
    // append the string to the result. Return the empty string if no string appears a 2nd time.
    //
    //wordAppend(["a", "b", "a"]) → "a"
    //wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
    //wordAppend(["a", "", "a"]) → "a"

    public static String wordAppend(String ... strings) {
        Map<String, Integer> map = new HashMap<>();
        String result = "";

        for (String s : strings) {
            if (!map.containsKey(s))
                map.put(s, 1);
            else {
                map.put(s, map.get(s) + 1);
                if (map.get(s) % 2 == 0){
                    result += s;
                    System.out.println(map.get(s));
                }

            }
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println( wordAppend("a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"));

    }
}
