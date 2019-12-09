package MutableImmutable.StringBuilder;

import Utilities.MyCollection;

import java.util.ArrayList;

public class InsertWord {
    //Create a method insertWord. The method will take an ArrayList of Strings.
    // Go through each word of your ArrayList and any element that has an even number
    // of characters will be changed to have “hello” in the middle of the String. Return the changed ArrayList.

    public static ArrayList<String> insertWord(ArrayList<String> str){
        for(int i = 0; i < str.size(); i++){
            if(str.get(i).length()%2 == 0){
                int mid = str.get(i).length()/2;
                StringBuilder sb = new StringBuilder(str.get(i));
                str.set(i, sb.insert(mid, "hello").toString());

            }
        }
        return str;
    }

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("asdf");
        str.add("cvbnmk");
       // System.out.println(InsertWord.insertWord(str));
        System.out.println(InsertWord.insertWord(str, "BB"));

    }

    //Overload the insertWord method to take two Strings. The first String will be the main String and
    // the second String will be the word inserted in the middle of all even numbered Strings.
    // Return the changed ArrayList.

    public static ArrayList<String> insertWord(ArrayList<String> str, String second){
        for(int i = 0; i < str.size(); i++){
            if(str.get(i).length()%2 == 0){
                int mid = str.get(i).length()/2;
                StringBuilder sb = new StringBuilder(str.get(i));
                str.set(i, sb.insert(mid, second).toString());

            }
        }
        return str;
    }
}
