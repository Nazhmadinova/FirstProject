package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class CountWords {

    public static void countWords(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter sentence:");
        String sentence = input.nextLine();

            String [] arr = sentence.trim().split(" ");
            int count = 0;
            for(int i = 0; i < arr.length; i++){
                count++;
            }
            System.out.println("the number of words in sentence is: "+count);
            System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        countWords();
    }
}
