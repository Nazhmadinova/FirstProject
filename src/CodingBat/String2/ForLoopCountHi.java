package CodingBat.String2;
//Return the number of times that the string "hi" appears anywhere in the given string.
public class ForLoopCountHi {
    public int countHi(String str) {
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            String hi=str.substring(i,i+2) ;
            if(hi.equals("hi")) count++;
        }
        return count;
    }
}
