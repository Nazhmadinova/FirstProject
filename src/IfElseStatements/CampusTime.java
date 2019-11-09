package IfElseStatements;

import java.util.Scanner;

public class CampusTime {
    public static void main(String[] args) {
//        Campus time: User enters a time(hour in 24 hour format)
//        and will be able to find out if the campus is open or not
//> Campus is open from 8 am to 11 pm (23)
// > If user enters a time within the open time they should see message :
// “open” but if the time entered is outside of operating hours they should see: “ closed”
//> If the user enters an invalid hour (negative number or more than 24 hours)
// they should see an error message: “invalid time”

        Scanner input = new Scanner(System.in);
        int time = input.nextInt();

        if (time >= 8 && time <= 23) {
            System.out.println("open");
        } else if (time < 0 || time >= 24) {
            System.out.println("invalid time");
        } else {
            System.out.println("closed");
        }

        //Other way:
        // boolean check;
        // if(time>=8 && time <=23){
        //check =true;
        // }else {
        // check = false;
        //}
        // if(check) {
        // System.out.println("open");
        //} else {
        // if(time < 0 || time >= 24){
        //System.out.println("invalid time");
        //} else {
        //  System.out.println("closed");}

    }
}
