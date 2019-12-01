package Utilities;

import java.util.ArrayList;

public class MyCollectionTest {
    public static void main(String[] args) {
        // I - part:
      //  System.out.println(MyCollection.getStringList());
        // or
//        ArrayList<String> words = MyCollection.getStringList();
//        System.out.println("\n"+words);

        // II - part:
      //  System.out.println(MyCollection.getIntegerList());

        // III - part:
//        ArrayList<String> words = new ArrayList<>();
//        words.add("hi");
//        words.add("bye");
//        words.add("hello");
//        words.add("good bye");
//        ArrayList<String> newList = MyCollection.filterList(words,5);
//        System.out.println(newList);

        // IV - part:
        ArrayList<String> elements = new ArrayList<>();
        elements.add("a");
        elements.add("v");
        elements.add("e");
        elements.add("a");
        elements.add("e");
        System.out.println(MyCollection.removeDuplicates(elements));
    }
}
