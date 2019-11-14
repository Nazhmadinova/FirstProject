package CodingBat.String3;

public class NotReplace {
    //Given a string, return a string where every appearance of the lowercase word "is"
    // has been replaced with "is not". The word "is" should not be immediately preceeded or
    // followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char)
    // tests if a char is a letter.)
    //
    //
    //notReplace("is test") → "is not test"
    //notReplace("is-is") → "is not-is not"
    //notReplace("This is right") → "This is not right"

    public String notReplace(String str) {
        String st="";
        int len = str.length();
        if (len < 2) return str;
        if (len == 2 && !str.equals("is")) return str;
        if (len == 2 && str.equals("is")) return "is not";

        for(int i=0;i<len;i++){
            st+=str.charAt(i);
            if(i==0 && str.substring(0,2).equals("is") && !Character.isLetter(str.charAt(2))){
                st+="s not";
                i++;
            }
            if(i>0 && i<len-2 && str.substring(i,i+2).equals("is") && !Character.isLetter(str.charAt(i-1)) && !Character.isLetter(str.charAt(i+2))){
                st+="s not";
                i++;
            }
            if(i==len-2 && str.substring(i).equals("is") && !Character.isLetter(str.charAt(i-1))){
                st+="s not";
                break;
            }
        }
        return st;
    }
}
