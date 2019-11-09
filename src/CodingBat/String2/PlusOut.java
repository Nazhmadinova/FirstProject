package CodingBat.String2;

public class PlusOut {
    //Given a string and a non-empty word string, return a version of the original
    // String where all chars have been replaced by pluses ("+"), except for appearances
    // of the word string which are preserved unchanged.
    //plusOut("12xy34", "xy") → "++xy++"
    //plusOut("12xy34", "1") → "1+++++"
    //plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"

    public static String plusOut(String str, String word) {
        String plus="";
        for(int i=0;i<str.length();i++){
            if (i + word.length() <= str.length() && str.substring(i, i + word.length()).equals(word)) {
                plus += word;
                i += word.length() - 1;
            } else {
                plus += "+";
            }
        }
        return plus;
    }

    public static void main(String[] args) {
        System.out.println(plusOut("12xy34xyabcxywexy","xy"));
    }

}
