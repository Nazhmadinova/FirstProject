package CodingBat.Map2;

import java.util.HashMap;
import java.util.Map;

public class FirstSwap {

    public static String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));

            if (map.containsKey(key)) {
                int index = map.get(key);
                if (index == -1) {
                    continue;
                }

                String swapper = strings[index];
                strings[index] = strings[i];
                strings[i] = swapper;

                map.put(key, -1);
            } else {
                map.put(key, i);
            }
        }
        return strings;
    }

}
