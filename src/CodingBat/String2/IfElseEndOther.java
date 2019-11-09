package CodingBat.String2;

public class IfElseEndOther {
    //Given two strings, return true if either of the strings appears at the very end of the other string,
    // ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
    // Note: str.toLowerCase() returns the lowercase version of a string.
    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        String end;
        String small;

        if(a.length() >=b.length())
        {
            end = a.substring(a.length() - b.length());
            small = b;
        }
        else
        {
            end = b.substring(b.length() - a.length());
            small = a;
        }
        return (end.equals(small));
    }
}
