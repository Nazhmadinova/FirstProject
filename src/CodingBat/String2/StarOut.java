package CodingBat.String2;

public class StarOut {
    //Return a version of the given string, where for every star (*) in the string the star
    // and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
    //starOut("ab*cd") → "ad"
    //starOut("ab**cd") → "ad"
    //starOut("sm*eilly") → "silly"
    public static String starOut(String str) {
        String out = "";
        int len = str.length();
        if (len == 0) return str;
        if (len == 1 && !str.equals("*")) return str;
        if (len == 2 && !str.substring(0, 1).equals("*") && !str.substring(1, 2).equals("*")) return str;
        for (int i = 0; i < len; i++) {
            if (str.substring(i, i + 1).equals("*")) {
                i += 1;
                continue;
            }
            if (i < len - 1 && str.substring(i + 1, i + 2).equals("*")) {
                i += 2;
                continue;
            }
            if (i == 0 && !str.substring(i, i + 1).equals("*") && !str.substring(i + 1, i + 2).equals("*"))
                out = out + str.substring(i, i + 1);
            if (i > 0 && i < len - 1 && !str.substring(i - 1, i).equals("*") && !str.substring(i, i + 1).equals("*")
                    && !str.substring(i + 1, i + 2).equals("*"))
                out = out + str.substring(i, i + 1);
            if (i == len - 1 && !str.substring(i, i + 1).equals("*")) out = out + str.substring(i, i + 1);
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(starOut("sm*eilly"));
    }
}
