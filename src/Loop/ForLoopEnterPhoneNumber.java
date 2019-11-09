package Loop;

import java.util.Scanner;

public class ForLoopEnterPhoneNumber {
    public static void main(String[] args) {
        //Ask user to enter their number (Take it as a String).
        // A number can only be valid if it is 10 characters long or is 12 characters with the “(“ and “)” characters
        // in the 1st or 5th characters. Then make sure the number provided contains
        // only numbers and not any other characters. If the number meets the length requirements and has
        // all valid characters print “Valid phone number” If the length requirement is not met or the number
        // contains invalid characters then print “Invalid phone number”
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        String number= input.nextLine();
        boolean validLength=false;

        if(number.length()==10){
            validLength=true;
        }else if(number.length()==12){
            if(number.charAt(0)=='('&& number.charAt(4)==')'){
                validLength=true;
                number= number.replace("(","").replace(")","");
            }
        }
        int count=0;
        if(validLength){
            for(int i=0;i<number.length();i++){
                char num=number.charAt(i);
                if(num>=48 &&num<=57){ //from 0 till 9;ASCII table
                    count++;
                }
            }
            if(count==number.length()){
                System.out.println("Valid number");
            }

        }else{
            System.out.println("Invalid phone number");
        }

    }
}
