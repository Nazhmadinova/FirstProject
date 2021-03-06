package Utilities;

import java.util.ArrayList;

import java.util.Scanner;

public class MyCollection {
    public static int size = 7;
    //Create a static method called getStringList. This method will keep asking user to enter
    // Strings until they are done. Take all the Strings they give and put them into an
    //ArrayList. Return the ArrayList after the user has entered all the information they wanted.
    // Flow:Please enter your String:
    // > Chair
    // Do you want to enter more?
    // Y/N> Y
    // Please enter your String:
    // > Hat
    // Do you want to enter more?
    // Y/N> N
    // —> Returns ArrayList including: Chair and Hat

    public static ArrayList<String> getStringList(){
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        String answer = "";
        do{
            System.out.println("Please enter your String:");
            String word = input.nextLine();
            words.add(word);
            System.out.println("Do you want to enter more?");
             answer = input.nextLine();
        }while (answer.equalsIgnoreCase("Y"));

        return words;
    }

    //Create a static method getIntegerList. This method does the same as getStringList,
    // but it accept numbers instead of Strings from the user

    public static ArrayList<Integer> getIntegerList(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String answer = "";
        do{
            System.out.println("Please enter your number:");
            Integer num = input.nextInt();
            numbers.add(num);
            System.out.println("Do you want to enter more?");
            input.nextLine();
            answer = input.nextLine();
        }while (answer.equalsIgnoreCase("Y"));

        return numbers;
    }



    //Create a static method filterList.
    // This method accepts a String array list and a number.
    // The method will go through each element from the array list and create
    // a new array list with Strings that have the same length as the number given in the parameters

    /**
     * The method will go through each element from the array list and creates
     *  a new array list with Strings that have the same length as the number given in the parameters
     * @param words
     * @param number
     * @return new array list
     */

    public static ArrayList<String> filterList(ArrayList<String> words, int number){

        ArrayList<String> newList = new ArrayList<>();

            for(int i = 0; i < words.size(); i++){
                if(words.get(i).length() == number){
                    newList.add(words.get(i));
                }
            }
        return newList;
    }


    //Create a static method removeDuplicates.This method accepts
    // a String array list and removes any duplicate elements.
    // The method will return an array list with only unique values

    public static ArrayList<String> removeDuplicates(ArrayList<String> elements){

        String str="";
        for(int i=0; i < elements.size(); i++){
            if(str.contains(elements.get(i))){
                elements.remove(i);
                i--;
            }else{
                str += elements.get(i);
            }
        }
        return elements;
    }

}

