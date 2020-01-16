package IntervewTasks;

public class ArmstrongNumber {

    //Create a method that will accept a number (int).
    // Return a boolean: true if the given number is an Armstrong number or
    // false if it is not— Armstrong number is a number that will take each digit of
    // the number and raise it to the power of the number’s length.
    // Then the results of each operation will be added together.
    // The final result of all the operations will be equal to the original
    // number for an Armstrong number. *** In our case we will look at only 3 digit numbers,
    // but if you want an extra challenge, make your code dynamic so it will check any digit length
    // Ex:
    // > input: 153         1^3 + 5^3 + 3 ^ 3 -> 1 + 125 + 27 = 153
    // > output: true

    public static boolean isArmstrong(int number){
        String num = number + "";
        int power = num.length();

        int sum = 0;

        for(int i = 0; i < num.length(); i++){
            int digit = Integer.parseInt(num.charAt(i)+"");
            //sum += Math.pow(digit,power);
            int m = 1;
            for(int j = 0; j < power; j++){
                m *= digit;
            }
            sum += m;
        }

        return sum == number;
    }
}
