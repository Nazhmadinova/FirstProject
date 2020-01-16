package Projects.Project4;

import java.util.Arrays;

public class IsAnagram {
    //isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.
    //
    //Each letter in word1 should appear in word2 exact number of times
    //Ignore empty spaces
    //Make your code case Insensitive
    //
    //Examples:
    //
    //isAnagram("listen", "Silent") ==> true
    //
    //
    //isAnagram("earth", "heart") ==> true
    //
    //
    //isAnagram("star", "rats") ==> true
    //
    //
    //isAnagram("hi", "bye") ==> false
    //
    //
    //isAnagram("java", "cava") ==> false

    /*
     * The method takes word1 and word2 and returns boolean. A method check if word1 and
     * word2 are anagram each other then return true, if not then return false
     * @param word1
     * @param word2
     * @return boolean
     * @see ("listen", "Silent") => true, ("java", "cava") => false
     *
     * */

        public static boolean isAnagram(String word1, String word2){
            word1=word1.replace(" ","");
            word2=word2.replace(" ","");
        if (word1.length()==word2.length()){
            word1=word1.toLowerCase();//listen
            word2=word2.toLowerCase();//silent
            String [] arr_word1 = word1.split("");
            String [] arr_word2 = word2.split("");
            Arrays.sort(arr_word1);
            Arrays.sort(arr_word2);
            if (Arrays.equals(arr_word1,arr_word2)){
                return true;
            }
            else return false;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("lis ten","silent"));
    }

}
