package CodingBat.String3;

public class MirrorEnds {
    //Given a string, look for a mirror image (backwards) string at both the beginning
    // and end of the given string. In other words, zero or more characters at the very
    // begining of the given string, and at the very end of the string in reverse order
    // (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

    //mirrorEnds("aba") → "aba"
    //mirrorEnds("abXYZba") → "ab"
    //mirrorEnds("abca") → "a"
    //mirrorEnds("aba") → "aba"

    public String mirrorEnds(String string) {
        String str="";
        String rev="";
        for(int i=string.length()-1;i>=0;i--){
            rev+=string.charAt(i);
        }

        if(rev.equalsIgnoreCase(string)){
            return rev;
        }else{
            for(int i=0;i<string.length()/2;i++){
                if(string.charAt(i)==string.charAt(string.length()-1-i)){
                    str+=string.charAt(i);
                }else{
                    break;
                }
            }
        }
        return str;
    }

    //Other way
    //public String mirrorEnds(String str) {
    //        String out = "";
    //        for (int i = 0; i < str.length(); i++) {
    //            if (str.charAt(i) != str.charAt(str.length()-1-i)) break;
    //            out += str.charAt(i);
    //        }
    //        return out;
    //    }

}
