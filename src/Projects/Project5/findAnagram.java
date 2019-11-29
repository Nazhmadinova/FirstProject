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

    public static String [] findAnagram(String word, String [] array) {

        int size=0;

        for(int i=0; i < array.length; i++) {
            int count = 0;
            String unique="";
            for (int j = 0; j < array[i].trim().length(); j++) {
                if(!unique.contains(array[i].trim().toLowerCase().charAt(j)+"")){
                    unique+=array[i].toLowerCase().charAt(j);
                    if(array[i].trim().length() == word.trim().length() && word.trim().toLowerCase().contains(array[i].trim().toLowerCase().charAt(j)+"")){
                        count++;
                    }
                }
            }
            if(count==word.trim().length()){
                size++;
            }
        }



        String[] newarr=new String[size];
        int index=0;
        for(int i=0; i < array.length; i++){
            int count=0;
            String unique="";
            for (int j = 0; j < array[i].trim().length(); j++) {
                if(!unique.contains(array[i].trim().toLowerCase().charAt(j)+"")){
                    unique+=array[i].trim().toLowerCase().charAt(j);
                    if(array[i].trim().length() == word.trim().length() && word.trim().toLowerCase().contains(array[i].trim().toLowerCase().charAt(j)+"")){
                        count++;
                    }
                }
            }
            if(count == word.trim().length()){
                newarr[index] = array[i];
                index++;
            }
        }
        return newarr;
    }

    public static void main(String[] args) {
        String []arr={"Listen ", "book", "linest","linest","siltnt", "adf"};
        System.out.println(Arrays.toString(findAnagram(" siltnt ",arr)));
    }
}
