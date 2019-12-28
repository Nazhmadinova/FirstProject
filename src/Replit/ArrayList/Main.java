package Replit.ArrayList;

import java.util.ArrayList;

public class Main {
    //Create a method that:
    //
    //is called removeEveryOther
    //returns nothing
    //takes in a single parameter - an ArrayList of Strings called words
    //
    //This method should take the ArrayList parameter and modify it by
    // removing every other element in the list, starting with removing the 0th element.
    //
    //For example, if the parameter is:
    //("hi","yo","sup","yolo","boop")
    //The modified ArrayList should be:
    //("yo","yolo")
    public static void main(String[] args)
    {
        Main m = new Main();
        ArrayList<String> words = new ArrayList<>();
        words.add("hi");
        words.add("yo");
        words.add("sup");
        words.add("yolo");
        words.add("boop");
        m.removeEveryOther(words);
    }

    public void removeEveryOther(ArrayList<String> words){
        for(int i = 0; i < words.size(); i++){
            words.remove(i);
        }
        System.out.println(words);
    }
}
