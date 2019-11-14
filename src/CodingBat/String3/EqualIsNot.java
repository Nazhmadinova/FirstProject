package CodingBat.String3;

public class EqualIsNot {
    // Given a string, return true if the number of appearances of "is" anywhere in the string is equal
    //    to the number of appearances of "not" anywhere in the string (case sensitive).
    //    equalIsNot("This is not") → false
    //    equalIsNot("This is notnot") → true
    //    equalIsNot("noisxxnotyynotxisi") → true

    public boolean equalIsNot(String str) {
        int is = 0, not = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) is++;
            if (i + 2 < str.length() && str.substring(i, i + 3).equals("not")) not++;
        }
        return is == not;
    }

    //Other way
    //int is=0;
    //  int not=0;
    //  for(int i=0;i<str.length()-1;i++){
    //    if(str.substring(i,i+2).equals("is")){
    //      is++;
    //    }
    //  }
    //  for(int i=0;i<str.length()-2;i++){
    //    if(str.substring(i,i+3).equals("not")){
    //      not++;
    //    }
    //  }
    //  if(is==not) return true;
    //
    //  return false;
}
