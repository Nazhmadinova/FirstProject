package CodingBat.Warmup2;

public class StringX {
    //Given a string, return a version where all the "x" have been removed.
    // Except an "x" at the very start or end should not be removed.
    //
    //stringX("xxHxix") → "xHix"
    //stringX("abxxxcd") → "abcd"
    //stringX("xabxxxcdx") → "xabcdx"
    public static String stringX(String str) {
        if(str.length()<=1) return str;
        String newstr="";
        for(int i=1;i<str.length()-1;i++){
            if(str.charAt(i)=='x'){
                continue;
            }else{
                newstr+=str.charAt(i);
            }
        }
        return str.charAt(0)+newstr+str.charAt(str.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
    }
}
