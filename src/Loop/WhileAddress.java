package Loop;

import java.util.Scanner;

public class WhileAddress {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your address");
        String address =in.nextLine();

        int count =0;

        while (address.contains("il")){
            System.out.println("Enter your address");
            address =in.nextLine();
            count++;
        }
        System.out.println(count);
    }
}
