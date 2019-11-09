package StringManipulation;

import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        //User will be asked to enter two full names ( first and last).
        // You will determine if the two entered people are relatives by comparing their last names.

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String name2= input.nextLine();
        int index= name.indexOf(" ");
        int index2=name2.indexOf(" ");

        int lastName=index+1;
        int lastName2=index2+1;

        String last= name.substring(lastName);
        String last2=name2.substring(lastName2);

        if(last.equals(last2)){
            System.out.println("relatives");
        }else{
            System.out.println("not relatives");
        }

        //other way:
        //String name1 = in.nextLine().trim();
        // String name2 = in.nextLine().trim();
        // String last1 = name1.substring(name1.indexOf(" ")+1);
        // String last2 = name2.substring(name2.indexOf(" ") + 1);
        // if(last1.equals(last2)) {
        // System.out.println("relatives");
        // } else {
        // System.out.println("not relatives");
        // }

    }
}
