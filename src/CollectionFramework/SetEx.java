package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {

        Set<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Lexus");
        cars.add("BMW");
        cars.add("Toyota");

     //   System.out.println(cars);
      //  System.out.println(cars.get(1));  unordered does not compile
       // List<String> list = new ArrayList<>(cars);

        for(String car: cars){
            System.out.println(car);
        }
    }
}
