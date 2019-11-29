package StaticClass;

import java.util.Arrays;

import static java.util.Arrays.*;
import static StaticClass.Pi.*;

public class ImportingStatic {
    public static void main(String[] args) {
        int [] a={3,2,4,1};
        sort(a);
        System.out.println();
        System.out.println(Arrays.toString(a));
        System.out.println(pi);
    }
}
