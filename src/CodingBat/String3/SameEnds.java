package CodingBat.String3;

public class SameEnds {
    //Given a string, return the longest substring that appears at both the beginning and end of
    // the string without overlapping. For example, sameEnds("abXab") is "ab".
    //
    //
    //sameEnds("abXYab") → "ab"
    //sameEnds("xx") → "x"
    //sameEnds("xxx") → "x"

    public String sameEnds(String string) {

        for(int i=0;i<string.length()/2;i++){
            if(string.length()%2==0){
                if(string.substring(0,string.length()/2-i).equals(string.substring(string.length()/2+i))){
                    return string.substring(0,string.length()/2-i);
                }
            }else{
                if(string.substring(0,string.length()/2-i).equals(string.substring(string.length()/2+1+i))){
                    return string.substring(0,string.length()/2-i);
                }
            }

        }
        return "";

    }
    //Other way
    //public String sameEnds(String string) {
    //        String result = "";
    //        int len = string.length();
    //        for (int i = 0; i <= len / 2; i++)
    //            for (int j = len / 2; j < len; j++)
    //                if (string.substring(0, i).equals(string.substring(j)))
    //                    result = string.substring(0, i);
    //        return result;
    //    }
}
