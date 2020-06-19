package IntervewTasks;

import java.util.HashMap;
import java.util.Map;

public class BalancingString {

    // If in the string sum of occurrence a with c and b with d even, then string is balanced

    public static boolean isBalanced(String str){

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i <str.length(); i++){
            String key = String.valueOf(str.charAt(i));

            if(!map.containsKey(key)){
                map.put(key, 1);
            }else{
                map.put(key, map.get(key) + 1);
            }

        }

        int sumAC = 0;
        int sumBD = 0;

        for(String key: map.keySet()){
            if(key.equals("a") || key.equals("c")){
                sumAC += map.get(key);
            }else if(key.equals("b") || key.equals("d")){
                sumBD += map.get(key);
            }
        }

        return sumAC % 2 == 0 && sumBD % 2 == 0;
    }

    public static void main(String[] args) {

        System.out.println(isBalanced("aaccbd"));

    }

}
