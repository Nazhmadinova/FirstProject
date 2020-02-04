package CodingBat.Map2;

import java.util.HashMap;
import java.util.Map;

public class AllSwap {

    public String[] allSwap(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < strings.length; i++){

            String key = "" + strings[i].charAt(0);

            if(!map.containsKey(key)){
                map.put(key, i);
            }else{

                String swapper = strings[map.get(key)];
                strings[map.get(key)] = strings[i];
                strings[i] = swapper;

                map.remove(key);

            }
        }

        return strings;

    }


}
