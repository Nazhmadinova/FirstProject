package Projects.Project5;

import java.util.Arrays;

public class findAnagram {

    public static String [] findAnagram(String word, String [] array) {

        int size=0;
        for(int i=0; i < array.length; i++){
            int count=0;
            for(int j=0; j < word.length();j++){
                if(array[i].length()==word.length() && array[i].toLowerCase().contains(word.toLowerCase().charAt(j)+"")){
                    count++;
                }
            }
            if(count==word.length()){
                size++;
            }

        }
        String[] newarr=new String[size];
        size=0;
        for(int i=0; i < array.length; i++){
            int count=0;
            for(int j=0; j < word.length(); j++){
                if(array[i].length() == word.length() && array[i].toLowerCase().contains(word.toLowerCase().charAt(j)+"")){
                    count++;
                }
            }
            if(count == word.length()){
                newarr[size] = array[i];
                size++;
            }
        }
        return newarr;
    }

    public static void main(String[] args) {
        String []arr={"Listen", "book", "linest","linest","silent", "adf"};
        System.out.println(Arrays.toString(findAnagram("silent",arr)));
    }
}
