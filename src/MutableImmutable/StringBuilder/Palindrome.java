package MutableImmutable.StringBuilder;

public class Palindrome {

        //Create a static method isPalindrome.
        // Method takes a String and check if the String is palindrome or not.
        // Return true if it is palindrome and false if it is not. Use StringBuilder

        public static boolean isPalindrome(String str){
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            if(str.equalsIgnoreCase(sb.toString())){
                return true;
            }
            return false;
        }

        //Create a method deleteWord. The method will take a String and check if “con” is in the String.
    // If it is in the String remove it from the String. Return the String with any changes.

        public static String deleteWord(String str){
            if(str.toLowerCase().contains(("con").toLowerCase())){
                int index = str.toLowerCase().indexOf(("con").toLowerCase());
                StringBuilder sb = new StringBuilder(str);
                sb.delete(index, index+3);
                return sb.toString();
            }
            return str;
        }

        //Overload the deleteWord method to take two Strings.
    // The first String is the main String and the second String is the String we are looking for.
    // Before this second String was always “con”, but now it will be more dynamic.
    // If the String we are looking for is found in the main String, then remove that part.
    // Return the String with any changes.

    public static String deleteWord(String str, String s){
        if(str.toLowerCase().contains(s.toLowerCase())){
            int index = str.toLowerCase().indexOf(s.toLowerCase());
            StringBuilder sb = new StringBuilder(str);
            sb.delete(index, index+s.length());
            return sb.toString();
        }
        return str;
    }

    public static void main(String[] args) {
        //System.out.println(Palindrome.deleteWord("I want to Concant"));
        //System.out.println(Palindrome.isPalindrome("Civic"));
        System.out.println(Palindrome.deleteWord("I want to Concant","con"));
    }


}
