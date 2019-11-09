package CodingBat.String2;

public class WordEnds {
    //Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

    //wordEnds("abcXY123XYijk", "XY") → "c13i"
    //wordEnds("XY123XY", "XY") → "13"
    //wordEnds("XY1XY", "XY") → "11"

    public String wordEnds(String str, String word) {
        String out = "";
        for (int i = 0; i <= str.length(); i++) {
            if (i + word.length() < str.length() && str.substring(i + 1, i + word.length()+1).equals(word)) {
                out += str.substring(i, i+1);
            }
            if (i + word.length() <= str.length() - 1 && str.substring(i, i + word.length()).equals(word)) {
                out += str.substring(i + word.length(), i + word.length() + 1);
            }
        }
        return out;
    }
}
