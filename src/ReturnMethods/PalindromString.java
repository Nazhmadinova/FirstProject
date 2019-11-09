package ReturnMethods;

public class PalindromString {
    // Create a method that will take a String as a parameter and return if the String is palindrome or not
    public static String palindrome(String word){
        //other way

        String newWord="";
        for(int i=word.length()-1;i>=0;i--){
            newWord+=word.charAt(i);
        }
        if(newWord.equals(word)) {
            return "palindrome";
        }
        return "not palindrom";
    }



    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
    }
}
