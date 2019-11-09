package scanner;

import java.util.Scanner;

public class UsingAnOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First number:");
        int fNumber = input.nextInt();
        System.out.println("Second number:");
        int sNumber = input.nextInt();
        System.out.println("Third number:");
        int tNumber = input.nextInt();
        int result = (fNumber+sNumber+tNumber)/2;
        System.out.println(result);

    }
}
