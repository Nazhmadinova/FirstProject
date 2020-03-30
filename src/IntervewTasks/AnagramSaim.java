package IntervewTasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class AnagramSaim {

    public static boolean isAnagram(String wordOne, String wordTwo) {

        wordOne = wordOne.replace(" ", "").toLowerCase();
        wordTwo = wordTwo.replace(" ", "").toLowerCase();

        if(wordOne.length() != wordTwo.length()) return false;

        int [] count = new int[26];
        for(int i=0; i < wordOne.length(); i++) {
            char one = wordOne.charAt(i);
            char two = wordTwo.charAt(i);
            // count[0] -> 'a'
            // count[26] -> 'z'
            // 70 - 46
            count[one - 'a'] = count[one - 'a'] + 1;
            count[two - 'a'] = count[two - 'a'] - 1;
        }

          System.out.println(Arrays.toString(count));
        return Arrays.equals(count, new int[26]);

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
    }


}
