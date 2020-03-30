package IntervewTasks;

import java.util.*;

public class GroupingAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, ArrayList<String>> map = new HashMap<>();

        for(String word: strs){
            char [] cArr = word.toCharArray();
            Arrays.sort(cArr);

            String key = String.valueOf(cArr);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }else{
                map.get(key).add(word);
            }
        }

        return new ArrayList<>(map.values());

    }

}
