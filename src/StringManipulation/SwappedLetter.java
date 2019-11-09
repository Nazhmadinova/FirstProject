package StringManipulation;

public class SwappedLetter {
    //Given a string, return a version without the first 2 chars.
    // Except keep the first char if it is 'a' and keep the second char if it is 'b'.
    // The string may be any length.
    //deFront("Hello") → "llo"
    //deFront("java") → "va"
    //deFront("away") → "aay"
    public String deFront(String str) {
        if (str.isEmpty()) {
            return str;
        }
        if (str.startsWith("a")) {
            if (str.length() == 1) {
                return str;
            } else if (str.length() >= 2) {
                if (str.indexOf("b") == 1) {
                    return str;
                } else {
                    return "a" + str.substring(2);
                }
            }
        }
        if (str.indexOf("b") == 1) {
            if (str.startsWith("a")) {
                return str;
            } else {
                return str.substring(1);
            }
        } else {
            return str.substring(2);
        }
    }
}
