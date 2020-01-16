package CollectionFramework;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SameColors {
    public static void main(String[] args) {
        //Create two Sets of Colors:
        //    Set 1 : "red","green","black","white"
        //    Set 2 : "red","yellow","white","pink"
        //    Go through both sets and return a String of all the colors which both Sets have

        String sameColors ="";

        Set<String> colors1 = new HashSet<>();
        Collections.addAll(colors1,"red","green","black","white");

        Set<String> colors2 = new HashSet<>();
        colors1.add("red");
        colors1.add("yellow");
        colors1.add("white");
        colors1.add("pink");

//        for(String color: colors1){
//            if(colors2.contains(color)){
//                sameColors+=color;
//            }
//        }

        for(String color: colors1){
            for(String color2: colors2){
                if(color.equals(color2)){
                    sameColors+=color;
                    break;
                }
            }
        }

        System.out.println(sameColors);
    }
}
