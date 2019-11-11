package Replit.ReturnMethod;

public class MergeStrings {
    public static void main(String[] args) {
        //s1 ==> "12345"
        //s2 ==> "abcde"
        //mergeStrings(s1,s2) ==> "1a2b3c4d5e"

        //mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

        //mergeStrings("java", "selenium") ==> "jsaevlaenium"
        System.out.println(mergeStrings("java","selenium"));


    }
    public static String mergeStrings(String one, String two) {
        String word="";
        if(one.length()>two.length()){
            for(int i=0;i<two.length();i++){
                word+=one.charAt(i);
                word+=two.charAt(i);
            }
            word+=one.substring(two.length());
        }else if(one.length()<two.length()){
            for(int i=0;i<one.length();i++){
                word+=one.charAt(i);
                word+=two.charAt(i);
            }
            word+=two.substring(one.length());
        }else{
            for(int i=0;i<one.length();i++){
               word+=one.charAt(i);
               word+=two.charAt(i);
            }
        }
        return word;

    }
}
