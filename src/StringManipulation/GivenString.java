package StringManipulation;

import java.util.Scanner;

public class GivenString {
    public static void main(String[] args) {
//   You have a String with the following value:
//    -> “Cybertek is located in Des Plaines”
//    The user is asked to enter a part of the string they are looking for.
//   Find the position of the String the user is looking for and print it.
//    Ex:
//> Input: “located”
//> Output: 12
        String sentence ="Cybertek is located in Des Plaines";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = input.nextLine();
        int index =sentence.indexOf(word);
        System.out.println(index);


//       Other way:
//        if (word.equals("Cybertek")){
//            System.out.println(sentence.indexOf("Cybertek"));
//        } else if (word.equals("is")){
//            System.out.println(sentence.indexOf("is"));
//        } else if(word.equals("located")){
//            System.out.println(sentence.indexOf("located"));
//        } else if (word.equals("in")){
//            System.out.println(sentence.indexOf("in"));
//        } else if (word.equals("Des")){
//            System.out.println(sentence.indexOf("Des"));
//        }else if (word.equals("Plaines")) {
//            System.out.println(sentence.indexOf("Plaines"));
//        }
    }
}
