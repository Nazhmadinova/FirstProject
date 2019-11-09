package Array;

import java.util.Scanner;

public class LoopStringStudent {
    public static void main(String[] args) {
        //Create String array for students. Initialize with students below: James, John, Adam, Elize, Jamie, Benzema
        //Loop through each elements of students. - print first character of each name on each line.

        //- Part II * Modify the loop and print the player names whose name ends with "s";

        //- Part III * Modify and print the player if it contains "s"

        //- Part IV * Read the String from the user using Scanner and print
        // out the players that contains the entered String keyword by user.
        String[]students={"James", "John", "Adam", "Elize", "Jamie", "Benzema"};
        Scanner input=new Scanner(System.in);



        for(int i=0;i<students.length;i++){
            System.out.println(students[i].charAt(0));
        }

        for(int i=0;i<students.length;i++){
        if(students[i].charAt(students[i].length()-1)=='s'){
            System.out.println(students[i]);
        }
        }

        for(int i=0;i<students.length;i++){
            if(students[i].contains("s")){
                System.out.println(students[i]);
            }
        }
        System.out.println("Enter String");
        String contain=input.nextLine();
        for(int i=0;i<students.length;i++){
            if(students[i].contains(contain)){
                System.out.println(students[i]);
            }
        }




    }
}
