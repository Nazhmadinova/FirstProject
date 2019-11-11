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
        System.out.println(coverString("hello hiiiiii", "ello") ) ;
    }
//    shorter way:
//    public static String coverString(String main, String coverME) {
//        if(main.contains(coverME)){
//            main=main.replace(coverME,"["+coverME+"]");
//            return main;
//        }
//
//        return "["+main+"]";
//
//    }

    public static String coverString(String main, String coverME) {
        String covered="";
        String covering="["+coverME+"]";
        if(main.contains(coverME) && main.length()>coverME.length()){
           outer: for(int i=0;i<main.length();i++){
               if( i==0 && main.substring(i,coverME.length()).equals(coverME)){
                   covered+=covering;
                   i+=coverME.length();
               }
               covered+=main.charAt(i);
           }
            return covered;
        }
        return "["+main+"]";
    }
}
