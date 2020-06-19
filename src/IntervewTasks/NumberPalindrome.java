package IntervewTasks;

public class NumberPalindrome {
    //Number Palindrome Create a method that will accept a number (long).
    // Return a boolean: true if your given number is a palindrome
    // number or false if it is not** You know how to do it with String manipulation.
    // If you want a challenge do it without using any String in your code
    // Ex: > input: 1001
    // > output: true
    // > input: 1234
    // > output: false

    public static boolean isPalindrome(long number){

        long workingNum = number;
        long reverse = 0;

        while (workingNum != 0){

           long last = workingNum % 10;
            reverse = reverse * 10 + last;
            workingNum /= 10;
        }

        return number == reverse;

    }
}
