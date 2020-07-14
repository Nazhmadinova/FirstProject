package CollectionFramework;

import java.util.*;

public class IteratorExSet {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("James");
        names.add("Joe");
        names.add("Sara");
        names.add("Ben");
        names.add("Adam");
        names.add("James");
        System.out.println(names);

        Iterator<String> it = names.iterator();
//        it.next(); // pointing to the "James"
//        System.out.println(it.next());

        while (it.hasNext()){

            String name = it.next();
            if(name.equals("Ben")){
                it.remove();
            }
        }
        System.out.println(names);
    }
}
