package StringManipulation;

import java.util.Scanner;

public class AnEmail {
    public static void main(String[] args) {
        //Creating an email. Ask user to enter two strings.
        // Both of these strings should be at least 6 character long.
        // If they are shorter than that print “Invalid data” and program should end.
        // If the information provided is valid, you will take the first 4 characters of first string
        // and combine them with the last three characters of the second string.
        // At the end of your combined string add “@cybertek.com”
        // and print the final string as your created email.
        // > input: “JamesBond”,  Secret
        // > output: jameret@cybertek.com

        Scanner input = new Scanner(System.in);
        String name1=input.nextLine();
        String name2 =input.nextLine();

        if(name1.length() >=6 && name2.length()>=6){
            String combine = name1.substring(0,4)+name2.substring(name2.length()-3);
            combine=combine.toLowerCase();
            System.out.println(combine+"@cybertek.com");
        }else{
            System.out.println("Invalid data");
        }
    }
}
