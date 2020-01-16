package Projects.Project5;

import java.util.Arrays;

public class findAnagram {

//    public static String [] findAnagram(String word, String [] array) {
//
//        int size=0;
//        for(int i=0; i < array.length; i++){
//            int count=0;
//            for(int j=0; j < array[i].trim().length();j++){
//                if(array[i].trim().length()==word.trim().length() && word.trim().toLowerCase().contains(array[i].trim().toLowerCase().charAt(j)+"")){
//                    count++;
//                }
//            }
//            if(count==word.trim().length()){
//                size++;
//            }
//
//        }
//        String[] newarr=new String[size];
//        int index=0;
//        for(int i=0; i < array.length; i++){
//            int count=0;
//            for(int j=0; j < array[i].trim().length(); j++){
//                if(array[i].trim().length() == word.trim().length() && word.trim().toLowerCase().contains(array[i].trim().toLowerCase().charAt(j)+"")){
//                    count++;
//                }
//            }
//            if(count == word.trim().length()){
//                newarr[index] = array[i];
//                index++;
//            }
//        }
//        return newarr;
//    }

//    public static String [] findAnagram(String word, String [] array) {
//
//        int size=0;
//
//        for(int i=0; i < array.length; i++) {
//            int count = 0;
//            String unique="";
//            for (int j = 0; j < array[i].trim().length(); j++) {
//                if(!unique.contains(array[i].trim().toLowerCase().charAt(j)+"")){
//                    unique+=array[i].toLowerCase().charAt(j);
//                    if(array[i].trim().length() == word.trim().length() && word.trim().toLowerCase().contains(array[i].trim().toLowerCase().charAt(j)+"")){
//                        count++;
//                    }
//                }
//            }
//            if(count==word.trim().length()){
//                size++;
//            }
//        }
//
//
//
//        String[] newarr=new String[size];
//        int index=0;
//        for(int i=0; i < array.length; i++){
//            int count=0;
//            String unique="";
//            for (int j = 0; j < array[i].trim().length(); j++) {
//                if(!unique.contains(array[i].trim().toLowerCase().charAt(j)+"")){
//                    unique+=array[i].trim().toLowerCase().charAt(j);
//                    if(array[i].trim().length() == word.trim().length() && word.trim().toLowerCase().contains(array[i].trim().toLowerCase().charAt(j)+"")){
//                        count++;
//                    }
//                }
//            }
//            if(count == word.trim().length()){
//                newarr[index] = array[i];
//                index++;
//            }
//        }
//        return newarr;
//    }

    public static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase().replace(" ","");
        b=b.toLowerCase().replace(" ","");
        String checked="";
        int counterA=0;
        int counterB=0;
        int indexChecking=0;
        if (a.length()!=b.length()) return false;
        else {
            for (int i=0; i<a.length(); i++){
                counterA=0;
                counterB=0;
                if (!checked.contains(""+a.charAt(i))) {
                    for (int j = 0; j < a.length(); j++) {
                        if (a.charAt(i) == a.charAt(j)) {
                            counterA++;
                        }
                    }
                    indexChecking = b.indexOf(("" + a.charAt(i)));
                    if (indexChecking < 0) return false;
                    for (int k = 0; k < b.length(); k++) {
                        if (b.charAt(indexChecking) == b.charAt(k)) {
                            counterB++;
                        }
                    }
                    checked = checked + a.charAt(i);
                    if (counterA != counterB) return false;
                   // else continue;
                }
            }
        }
        return true;
    }


    public static String [] findAnagram(String word, String [] array) {

        // silent => word;  array { listen, book, linest, adf,}

        // array => {listen, linest}

        // TODO

        String [] arr ={};
        int size = 0;

        for (int i=0; i<array.length; i++){
            if (isAnagram(word,array[i])){
                size++;
            }
        }

        if(size > 0){
            arr = new String[size];
            for (int i=0, j = 0; i < array.length; i++){
                if (isAnagram(word, array[i])){
                    arr[j] = array[i];
                    j++;
                }
            }
        }

         return arr;
    }





//    public static void main(String[] args) {
//        String []arr={"Listen", "book", "linest","linest","silent", "adf"};
//        System.out.println(Arrays.toString(findAnagram(" silent ",arr)));
//    }
}
