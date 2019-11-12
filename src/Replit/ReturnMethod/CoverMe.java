package Replit.ReturnMethod;

public class CoverMe {
    //coverString("java methods", "me") ) ; ==> "java [me]thods"
    //
    //coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"
    //
    //coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"
    //
    //coverString("apples", "pears") ) ; ==> "[apples]"
    //keep in mind that coverME value can be of any length

    public static void main(String[] args) {
        System.out.println(coverString("mememe memome", "me") ) ;
    }

    public static String coverString(String main, String coverME) {
        String covered="";
        String covering="["+coverME+"]";

        if(main.contains(coverME)){
            for(int i=0;i<main.length();i++){
                if (i + coverME.length() <=main.length() && main.substring(i, i + coverME.length()).equalsIgnoreCase(coverME)){
                        covered += covering;
                        i += coverME.length()-1;
                } else{
                    covered+=main.charAt(i);
                }
           }
            return covered;
        }
        return "["+main+"]";
    }
}
