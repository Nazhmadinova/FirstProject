package ReturnMethods;

public class ReversString {
    //Create a method that will accept a String and will reverse your String. Return the reversed String.
    public static String revers(String word){
        String rev="";
        for(int i=word.length()-1;i>=0;i--){
            rev+=""+word.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(revers("Zhaina"));
    }
}
