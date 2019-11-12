package CodingBat.String3;

import java.util.Arrays;

public class WithoutString {
    //Given two strings, base and remove, return a version of the base string where all instances
    // of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more.
    // Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
    //withoutString("Hello there", "llo") → "He there"
    //withoutString("Hello there", "e") → "Hllo thr"
    //withoutString("Hello there", "x") → "Hello there"

    public String withoutString(String base, String remove) {
        if(base.length()>=remove.length()){
            String removed="";
            for(int i=0; i<base.length();i++){
                if(i+remove.length()<=base.length() && base.substring(i,i+remove.length()).equalsIgnoreCase(remove)){
                    i+=remove.length()-1;
                }else{
                    removed+=base.substring(i, i + 1);
                }

            }
            return removed;
        }
        return base;
    }

}
