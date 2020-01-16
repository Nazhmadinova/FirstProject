package IntervewTasks;

import java.util.Arrays;

public class Anagram {

//    public static boolean isAnagram(String a, String b) {
//        // Complete the function
//        a=a.toLowerCase().replace(" ","");
//        b=b.toLowerCase().replace(" ","");
//        String checked="";
//        int counterA=0;
//        int counterB=0;
//        int indexChecking=0;
//        if (a.length()!=b.length()) return false;
//        else {
//            for (int i=0; i<a.length(); i++){
//                counterA=0;
//                counterB=0;
//                if (!checked.contains(""+a.charAt(i))) {
//                    for (int j = 0; j < a.length(); j++) {
//                        if (a.charAt(i) == a.charAt(j)) {
//                            counterA++;
//                        }
//                    }
//                    indexChecking = b.indexOf(("" + a.charAt(i)));
//                    if (indexChecking < 0) return false;
//                    for (int k = 0; k < b.length(); k++) {
//                        if (b.charAt(indexChecking) == b.charAt(k)) {
//                            counterB++;
//                        }
//                    }
//                    checked = checked + a.charAt(i);
//                    if (counterA != counterB) return false;
//                    // else continue;
//                }
//            }
//        }
//        return true;
//    }


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
        String w1 = "DC BA";
        String w2 = "bc da";
        w1 = w1.toLowerCase().replace(" ","");
        w2 = w2.toLowerCase().replace(" ","");
        char[] arrW1 = w1.toCharArray();
        char[] arrW2 = w2.toCharArray();
        char temp;
        for (int i = 0; i < arrW1.length; i++) {
            for (int j = 0; j < arrW1.length - 1; j++) {
                if (arrW1[j] > arrW1[j + 1]) {
                    temp = arrW1[j];
                    arrW1[j] = arrW1[j + 1];
                    arrW1[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arrW2.length; i++) {
            for (int j = 0; j < arrW2.length - 1; j++) {
                if (arrW2[j] > arrW2[j + 1]) {
                    temp = arrW2[j];
                    arrW2[j] = arrW2[j + 1];
                    arrW2[j + 1] = temp;
                }
            }
        }
        System.out.println(arrW1);
        System.out.println(arrW2);
        if(Arrays.equals(arrW1,arrW2))
            System.out.println("Is anagram");
        else
            System.out.println("Not anagram");
    }
}
