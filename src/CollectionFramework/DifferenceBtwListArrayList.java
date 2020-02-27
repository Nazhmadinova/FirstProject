package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DifferenceBtwListArrayList {

    public static void main(String[] args) {


        List<String> expectedOptions = new ArrayList<>(Arrays.asList("Daily","Weekly","Monthly","Yearly"));
        expectedOptions.add("g"); // no exception you can change the size, here left side List, right side ArrayList
        System.out.println(expectedOptions);

        List<String> expectedOption = Arrays.asList("Daily","Weekly","Monthly","Yearly");
        //expectedOptions.add("g"); // exception will throw, you can not change the size, it is List not ArrayList
        System.out.println(expectedOption);
    }

}
