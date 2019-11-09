package CodingBat.String2;

public class ForLoopDoubleChar {
    public String doubleChar(String str) {
        //Given a string, return a string where for every char in the original, there are two chars.
        String str2 ="";
        for (int i=0; i<str.length(); i++){
            str2 +="" + str.charAt(i)+str.charAt(i);
        }
        return str2;

    }
}
