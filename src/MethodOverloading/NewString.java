package MethodOverloading;

public class NewString {
    //Create a method that will accept two Strings.
    // Return a new String that has the firstWord then the secondWord and then the firstWord again
    //> input: “day”, “name”
    //> output: “daynameday”

    //Overload the method above to now accept the two Strings and an integer.
    // The integer given tells you how many times your first word should show up in your new String.
    // Your first words need to always be separated by the second word.
    // > input: “day”, “name”, 3
    //> output: “daynamedaynameday”

    public static String newString(String word1,String word2){
        return word1+word2+word1;
    }

    public static String newString(String word1, String word2, int num){
        String newWord = "";
        if(num>0) {
            for (int i = 0; i < num; i++) {
                newWord += word1 + word2;
                // other way to not include the last word
                //newWord+=word1;
                //if(i==num-1){
                //  break;
                //  }
                //newWord+=word2;
                //return newWord;
            }
            return newWord.substring(0, newWord.length() - word2.length());
        }
        return newWord;
    }

    public static void main(String[] args) {
        System.out.println(newString("day","name"));
        System.out.println(newString("day","name",2));
    }
}
