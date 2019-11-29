package Projects.Project5;

import java.io.*;

public class WholeProject5 {

        public String getWord(int index, String [] words) {
            // TODO
            if(index<words.length){
                return words[index];
            }
            return null;
        }
        /**
         *
         * @param word:
         *            input word
         * @return true if the given word exists in the words array. False otherwise
         */
        public boolean contains(String word, String [] words) {
            // TODO
            for(int i = 0; i < words.length; i++){
                if(words[i].contains(word)){
                    return true;
                }
            }
            return false;
        }
        /**
         *
         * @param word:
         *            input word
         * @param array:
         *            input array
         * @return add word to begining of the array and return array
         */
        public String[] addWordArray(String word, String[] array) {
            // TODO
            String[] newwords=new String[array.length+1];
            for(int i=0;i<array.length;i++){
                newwords[i+1]=array[i];
            }
            newwords[0]=word;
            return newwords;
        }
        /**
         *
         * @param sentence:
         *            input sentence
         * @return true if every word in the sentence exists in your words array. False
         *         otherwise.
         */
        // apple is sweet
        public static boolean containsSentence(String sentence,String [] words) {
            //TODO
            String[]arr = sentence.trim().split(" ");
            int count=0;
            for(int i=0;i<arr.length;i++){
                int c=0;
                for(int j=0; j < words.length; j++){
                    if(arr[i].equalsIgnoreCase(words[j])){
                        c++;
                    }
                }
                if(c>=1){
                    count++;
                }
            }
            if (count == arr.length){
                return true;
            }
            return false;
        }

    public static void main(String[] args) {
            String [] words={"apple", "is","sweet","hjb","hgj"};
        System.out.println(containsSentence("apple is sweet",words));

    }
        /**
         * reverse a sentence
         *
         * @param sentence:
         *            input sentence
         * @return reversed sentence. For example: input: "i love java" return: "java love
         *         i" (hint: trim leading and trailing spaces")
         */
        public String reverseSentence(String sentence) {
            // TODO
            String newStr = "";
            String [] result = sentence.trim().split(" ");
            for(int i =result.length-1; i >=0; i--){
                newStr+= result[i]+" ";
            }
            return newStr.trim();
        }
        /**
         *
         * @param word:
         *            input word
         * @return the number of occurrences of the words array . If the word does not
         *         exist, return 0
         */
        public int count(String word,String [] words) {
            // TODO
            int count=0;
            for(int i=0; i<words.length;i++){
                if(word.equalsIgnoreCase(words[i])){
                    count++;
                }
            }
            return count;
        }
        /*
         *
         *
         * @param word:
         *            input word
         * @param fileName:
         *            input String of array
         *
         * @return return array of anagram words
         *
         */
        public String [] findAnagram(String word, String [] array) {

            int size=0;
            for(int i=0;i<array.length;i++){
                int count=0;
                for(int j=0;j<word.length();j++){
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
            for(int i=0;i<array.length;i++){
                int count=0;
                for(int j=0;j<word.length();j++){
                    if(array[i].length()==word.length()&&array[i].toLowerCase().contains(word.toLowerCase().charAt(j)+"")){
                        count++;
                    }
                }
                if(count==word.length()){
                    newarr[size]=array[i];
                    size++;
                }
            }
            return newarr;
        }
        /**
         *
         * extra credit
         * @param array: integer of array
         * @return return array of sorted integer
         * DO NOT USE ARRAYS.SORT
         */
        public int[] sort(int[] array){
            int temp=0;
            for (int i=0;i<array.length;i++){
                for(int j=i+1;j<array.length;j++){
                    if(array[i]>array[j]){
                        temp=array[j];
                        array[j]=array[i];
                        array[i]=temp;
                    }
                }
            }
            return  array;
        }


    }

