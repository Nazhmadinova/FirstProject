package CodingBat.Warmup2;

public class AltPairs {
    //Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
    //
    //
    //altPairs("kitten") → "kien"
    //altPairs("Chocolate") → "Chole"
    //altPairs("CodingHorror") → "Congrr"

    public String altPairs(String str) {
        if(str.length()<=1) return str;
        String n="";
        for(int i=0;i<str.length();i+=4){
            int k=i+2;
            if(k>str.length())
                k=str.length();
            n+=str.substring(i,k);
        }
        return n;
    }
}
