package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

    public static void main(String[] args) {

        Map < String, Integer > gradeScale = new HashMap<>();
        gradeScale.put("A",99);
        gradeScale.put("B",80);
        gradeScale.put("C",70);
        gradeScale.put("D",60);
        gradeScale.put("F",50);
        gradeScale.put("F",30); // here you just changing the value of "F", overriding


//        System.out.println(gradeScale.get("B"));
//        System.out.println(gradeScale.get("F"));
//        System.out.println(gradeScale.get("G"));
//        System.out.println(gradeScale);
//
//        gradeScale.remove("F");
//
//        System.out.println(gradeScale);
//        System.out.println(gradeScale.containsKey("A"));
//        System.out.println(gradeScale.containsValue(80));

        Set <String> keys = gradeScale.keySet();

        for(String key: keys){  // or instead of keys we can put gradeScale.keySet()
            if(key.equals("C")) gradeScale.put(key, 75);
            System.out.println(gradeScale.get(key));
        }




    }
}
