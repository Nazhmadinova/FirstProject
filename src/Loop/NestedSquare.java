package Loop;

import java.util.Scanner;

public class NestedSquare {
    //Write a program that asks the user to enter a number.
    // The number will be how big your square will be. Square made of ‘#’ sign
    //> input: 5
    //> output:
    //# # # # #
    //# # # # #
    //# # # # #
    //# # # # #
    //# # # # #
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num=input.nextInt();

        for(int i = 0; i<num+3;i++){
            for(int j=0;j<num;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
