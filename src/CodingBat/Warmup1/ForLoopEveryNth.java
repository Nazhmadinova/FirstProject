package CodingBat.Warmup1;

public class ForLoopEveryNth {
    public String everyNth(String str, int n) {
        String evertNth="";
        for(int i = 0; i < str.length(); i += n){
            evertNth+=""+str.charAt(i);
        }
        return evertNth;
    }
}
