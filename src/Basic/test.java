package Basic;

import java.util.*;


public class test {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        Iterator<String> it = set.iterator();
        set.add("a");
        set.add("b");
        set.remove("a");
        System.out.println(set);

    }
}
