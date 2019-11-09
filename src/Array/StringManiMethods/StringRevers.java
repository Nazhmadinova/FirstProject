package Array.StringManiMethods;

import java.util.Arrays;

public class StringRevers {
    public static void main(String[] args) {
        //Given the String: “It started to snow in Chicago”
        //Reverse each individual word and print the result
        //> expected output:
        //tI detrats ot wons ni ogacihC

        String str="It started to snow in Chicago";
        String [] separate =str.split(" ");

        String finalString="";

        for(int i=0;i<separate.length;i++){
            String rev="";
            for(int j=(separate[i].length()-1);j>=0;j--){

                rev+=""+separate[i].charAt(j);
            }
            finalString+=rev+" ";

        }
        System.out.println(finalString);

        //other way
        //String str = "It started to snow in Chicago";
        //        String [] words = str.split(" ");
        //        String finalString = "";
        //        for(String word: words) {
        //            String rev = "";
        //            for(int i= word.length()-1; i >= 0; i--) {
        //                rev += word.charAt(i);
        //            }
        //            finalString += rev + " ";
        //        }
        //        System.out.println(finalString);

    }
}
