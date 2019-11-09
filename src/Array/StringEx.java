package Array;

import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {
        String [] names=new String[3];
        System.out.println(Arrays.toString(names));
        names[0]="j";
        names[1]="b";
        names[2]="n";
        System.out.println(Arrays.toString(names));
        System.out.println(names); // it is gonna print just address

    }
}
