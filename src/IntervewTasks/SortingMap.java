package IntervewTasks;

import java.util.*;

public class SortingMap {

    public static void main(String[] args) {

        HashMap<String, String> fruits = new HashMap<>();
        fruits.put("d","pear");
        fruits.put("e","apple");
        fruits.put("f","apple");
        fruits.put("a","peach");
        fruits.put("t","banana");
        fruits.put("c","apple");
        fruits.put("g","apple");

        // sorting by keys

        Set<Map.Entry<String,String>> entries = fruits.entrySet();

        for(Map.Entry<String,String> entry: entries){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }


        TreeMap<String, String> sorted = new TreeMap<>(fruits);


        System.out.println(fruits);
        System.out.println(sorted);

        // sorting by values
        LinkedHashMap<String,String> orderByValue = new LinkedHashMap<>();

        String [] values = new String[fruits.size()];
        int index = 0;
        for(String key: fruits.keySet()){
            values[index] = fruits.get(key);
            index++;
        }

        // Arrays.sort(values);

        String temp;
        for(int i = 0; i < values.length - 1; i ++){
            for(int j = i + 1; j < values.length; j++){
                if(values[i].compareTo(values[j]) > 0){
                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }

        for(String value: values){
            for(String key: fruits.keySet()){
                if(value.equals(fruits.get(key))){
                    orderByValue.put(key,value);
                }
            }
        }

        System.out.println(orderByValue);

    }

}
