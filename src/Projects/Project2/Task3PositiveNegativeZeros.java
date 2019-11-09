package Projects.Project2;

import java.util.Scanner;

public class Task3PositiveNegativeZeros {
    public static void main(String[] args) {
        //Write a program to prompt the user to enter the numbers till the user wants (by asking user
        // if he wants to continue) and at the end it should display the count of positive, negative and zeros entered.
        // (Hint: use do while loop)
        //
        //	Example:
        //
        //        Input:
        //	Enter the number: 9
        //	Do you want to continue y/n? y
        //	Enter the number: -5
        //	Do you want to continue y/n? y
        //	Enter the number: 0
        //	Do you want to continue y/n? y
        //	Enter the number: 66
        //	Do you want to continue y/n? n
        //
        //        Output:
        //	Positive numbers: 2
        //	Negative numbers: 1
        //	Zero numbers:

//            Scanner in = new Scanner(System.in);
//            char r = 'y';
//            int n, pos = 0, neg = 0, zero = 0;
//            while (r == 'y'){
//                System.out.println("Enter the number: ");
//                n = in.nextInt();
//                if (n > 0){
//                    pos++;
//                }
//                else if (n < 0){
//                    neg++;
//                }
//                else {
//                    zero++;
//                }
//                System.out.println("Do you want to continue y/n?: ");
//                r = in.next().charAt(0);
//            }
//            System.out.println("Positive numbers: " + pos);
//            System.out.println("Negative numbers: " + neg);
//            System.out.println("Zero numbers: " + zero);

        Scanner console = new Scanner(System.in);

        int number,
                countPositive = 0,
                countNegative = 0,
                countZero = 0;

        char choice;

        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();

            if(number > 0)
            {
                countPositive++;
            }
            else if(number < 0)
            {
                countNegative++;
            }
            else
            {
                countZero++;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        }while(choice=='y' || choice == 'Y');

        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }
}
