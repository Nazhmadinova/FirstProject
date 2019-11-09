package StringManipulation;

public class SwappedFirst2Chars {
    //Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
    // and otherwise return the string unchanged.
    //withoutX2("xHi") → "Hi"
    //withoutX2("Hxi") → "Hi"
    //withoutX2("Hi") → "Hi"

    public String withoutX2(String str) {
        if(str.startsWith("xx")){
            return str.substring(2);
        }else if(str.startsWith("x") && str.indexOf("x")!=1){
            return str.substring(1);
        }else if(!str.startsWith("x") && str.indexOf("x")==1){
            return str.substring(0,2);
        }else{
            return str;
        }
    }
}
