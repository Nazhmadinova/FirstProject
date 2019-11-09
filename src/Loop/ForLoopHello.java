package Loop;

import java.util.Scanner;

public class ForLoopHello {
    public static void main(String[] args) {
        //Write a program that asks from the user infinitely:
        //if user enters "hi" your program answers "hello", if user enters "bye" your program says "good bye"
        //Flow:
        //> hi
        //Hello
        //> bye
        //Good bye
        //> james
        //Good bye

        Scanner input = new Scanner(System.in);
        for(;;) {
            String word =input.nextLine();
            if (word.equalsIgnoreCase("hi")) {
                System.out.println("hello");
            }else if(word.equalsIgnoreCase("bye")){
                System.out.println("Good bye");
            }
            else{
                System.out.println("Bye forever");
                break;
            }
        }
    }
}
