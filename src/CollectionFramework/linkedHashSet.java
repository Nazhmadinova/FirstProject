package CollectionFramework;

import java.util.LinkedHashSet;

public class linkedHashSet {

    public static void main(String[] args) {

        // LinkedHashSet is ordered. Extends HashSet class.

        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("z");
        set.add("y");
        set.add(null);
        set.add("z");
        set.add("80");
        set.add("/");
        set.add(null);
        set.add("z");
        set.add("a");
        System.out.println(set);
    }

}
