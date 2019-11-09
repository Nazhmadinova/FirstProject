package StringManipulation;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
//        String word ="Java";
//        String word2 = "is fun";
//        char c = word.charAt(2);
//        char f = word.charAt(0);
//        System.out.println(c);
//        System.out.println(""+ c+f);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a massage");
        String message = input.nextLine();

        if(message.isEmpty()) {
            System.out.println("Message is empty");
        }else if (message.length() >=10){
            System.out.println("Message is good");
        }else {
            System.out.println("Message is too short");
        }
    }
}
