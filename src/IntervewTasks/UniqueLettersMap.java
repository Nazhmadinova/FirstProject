package IntervewTasks;

import java.util.HashMap;
import java.util.Map;

public class UniqueLettersMap {

    public static int lengthOfLongestSubstring(String s) {

        int max = 0;
        int check = 0;

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){

            char c = s.charAt(i);

            if(!map.containsKey(c)){
                map.put(c, i);
                check++;
            }else{
                i = map.get(c);
                check = 0;
                map.clear();
            }

            max = max > check ? max : check;
        }

        return max;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

}
