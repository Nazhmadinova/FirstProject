package Projects.Project4;

public class Task2 {
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

    // Required! Method name is: isAnagram(String word1, String word2)

//    public static boolean isAnagram(String word1, String word2) {
//
//        word1 = word1.toLowerCase().trim();
//        word2 = word2.toLowerCase().trim();
//        int count=0;
//        if(word1.contains(" ")){
//            word1=word1.replace(" ","");
//        }
//        if(word2.contains(" ")){
//            word2=word2.replace(" ","");
//        }
//
//        if(word1.length()==word2.length()){
//            for (int i = 0; i < word1.length(); i++) {
//                if (word2.contains(word1.charAt(i) + "")) {
//                    count++;
//                }
//            }
//            if (count == word1.length()) {
//                return true;
//            }
//        }
//        return false;
//    }

    //Other way
    public static boolean isAnagram(String word1, String word2) {

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        boolean check=false;
        if(word1.contains(" ")){
            word1=word1.replace(" ","");
        }
        if(word2.contains(" ")){
            word2=word2.replace(" ","");
        }

        if(word1.length()==word2.length()){
            for (int i = 0; i < word1.length(); i++) {
                if (!word2.contains(word1.charAt(i) + "")) {
                    check=false;
                }
                check=true;
            }

        }
        return check;
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("lis ten","silent"));
    }

}
