package ReturnMethods;

public class PalindromBoolean {
    // // Create a method that will take a String as a parameter and return if the String is palindrome or not
    public static boolean palindrome(String word){
        if(ReversString.revers(word).equals(word)){
            return true;
        }
        return false;

    }



    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
    }
}
