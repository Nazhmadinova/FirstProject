package Replit.Loop;

import java.util.Scanner;

public class ForLoopInfinitParty {
    public static void main(String[] args) {
        //Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
        //Ask for the first guest name.
        //Then ask does user want to enter one more guest.
        // If yes - take input from.
        //If not - finish the program and print list of the guests.
        //
        //Example of the program:
        //
        //Please enter guest name:
        //Nick
        //Do you want to enter new guest name:
        //yes
        //Please enter guest name:
        //Linda
        //Do you want to enter new guest name:
        //no
        //
        //Guest's list: Nick, Linda

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter guest name:");
        String name =input.nextLine();
        String sum="";
        for(;;){
            System.out.println("Do you want to enter new guest name:");
            String answer=input.nextLine();
            if(answer.equals("yes")){
                System.out.println("Please enter guest name:");
                String name2 =input.nextLine();
                sum+=name2;

            }else if(answer.equals("no")){
                break;
            }
        }
        System.out.println("Guest's list: "+name+", "+sum);
    }
}
