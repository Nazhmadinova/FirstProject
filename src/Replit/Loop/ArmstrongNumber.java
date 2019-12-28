package Replit.Loop;

public class
ArmstrongNumber {
    public static void main(String[] args) {
        //Write a program to print out all Armstrong numbers between 1 and 500.
        // If sum of cubes of each digit of the number is equal to the number itself,
        // then the number is called an Armstrong number.
        //for example:
        //153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
        //
        //Output:
        //1
        //153
        //370
        //371
        //407
        for(int i=1;i<=500;i++){
            int check, remainder, sum = 0;
            check = i;
            while(check != 0) {
                remainder = check % 10;
                sum = sum + (remainder * remainder * remainder);
                check = check / 10;
            }
            if(sum == i){
                System.out.println(i);
            }
        }

        //other way
        //for(int i = 1; i <= 500; i++){
        //
        //      int one = i % 10;
        //      int a = i /10;
        //      int two = a % 10;
        //      int b = a / 10;
        //      int three = b % 10;
        //
        //      int result = (one * one * one) +(two * two * two) + (three * three * three);
        //      if(i == result){
        //        System.out.println(i);
        //      }
        //    }
    }
}
