package StringManipulation;

import java.util.Scanner;

public class MiddleOneOdd {
    public static void main(String[] args) {


            System.out.println("Please enter word:");
            Scanner scanner = new Scanner(System.in);
            String n1 = scanner.nextLine();

            if(n1.length()>=3&&n1.length()%2!=0){
                String middle = n1.substring(n1.length()/2,n1.length()/2+1);
                System.out.println(middle);
            }
    }
}
