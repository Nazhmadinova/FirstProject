package MethodOverloading;

public class FirstChar {
    //Create a method that takes a String, it will print the first characters
    //Then overload the method to take a String, and an index. And print the character found at that index
    //Then overload the method to take a String and two numbers.
    // Take the substring of the String based on the two numbers provided.
    // Return the length of the substring String
    public static void main(String[] args) {
        firstChar("Zhaina");
        firstChar("Zhaina",2);
        System.out.println(firstChar("Zhaina",1,4));
    }

    public static void firstChar(String word){
        System.out.println(word.charAt(0));
    }
    public static void firstChar(String word,int index){
        if(index<=word.length()-1){
            System.out.println(word.charAt(index));
        }else{
            System.out.println("out of bound");
        }
    }

    public static int firstChar(String word,int num1,int num2){
        return word.substring(num1,num2).length();

    }

}
