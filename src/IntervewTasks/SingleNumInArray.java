package IntervewTasks;

import java.util.HashMap;
import java.util.Map;

public class SingleNumInArray {

    //Given a non-empty array of integers, every element appear twice, except for one. Return that number



        public static int notADuplicate(int [] nums) {
            Map<Integer, Boolean> map = new HashMap<>();
            for(int number : nums) {
                if(!map.containsKey(number)){
                    map.put(number, false);
                } else {
                    map.put(number, true);
                }
            }

        for(Integer key: map.keySet()) {
            if(!map.get(key)) return key;
        }
            return 0;
        }

    //other way
//    public static int notADuplicate(int [] nums) {
//        Map <Integer, Boolean> map = new HashMap<>();
//        for(int number : nums) {
//            if(!map.containsKey(number)){
//                map.put(number, false);
//            } else {
//                map.remove(number);
//            }
//        }
////        for(Integer key: map.keySet()) {
////            if(!map.get(key)) return key;
////        }
//        return ((int)map.keySet().toArray()[0]);
//    }

}
