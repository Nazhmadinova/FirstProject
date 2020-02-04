package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MatchingNumMap {

    public static void main(String[] args) {

        //Given this map:
        //        Map<String, Integer> map = new HashMap<>();
        //        map.put("First",1);
        //        map.put("Second",2);
        //        map.put("Third",3);
        //        map.put("Forth",4);
        //    Ask the user to enter a number from 1 to 4.
        //    Then print out the key that goes with the number they entered.
        //    If the user enters a number that is not in the map print "Invalid Number"

        Map <String, Integer> map = new HashMap<>();
        map.put("First",1);
        map.put("Second",2);
        map.put("Third",3);
        map.put("Forth",4);


        int num = new Scanner(System.in).nextInt();

        if(!map.containsValue(num)){
            System.out.println("Invalid Number");
            System.exit(0);
        }

        for(String key: map.keySet()){
            if(map.get(key) == num){
                System.out.println(key + " " + map.get(key));
                break;
            }
        }
    }
}
