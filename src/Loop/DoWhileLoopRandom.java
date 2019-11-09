package Loop;
import java.util.*;

public class DoWhileLoopRandom {
    public static void main(String[] args) {
        //Generate a random number from 1 to 100. Ask the user to guess the number.
        // If the guess is too high print “Too high” If the guess is too low print “Too low”.
        // They continue to guess until they guess the correct number.
        // Count how many guesses were taken and when the number is guessed correctly print
        // You guessed right after guessValue tries !
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int randomNumber = random.nextInt(100)+1;
        int guess=0;
        int count =0;

        do{
            System.out.println("guess the number");
            guess= input.nextInt();
            count++;

            if(guess<randomNumber){
                System.out.println("Too low");
            }else if(guess>randomNumber){
                System.out.println("Too high");
            }else{
                System.out.println("You guessed right after "+ count+" tries!");
            }
        }while (randomNumber!=guess);



    }

}
