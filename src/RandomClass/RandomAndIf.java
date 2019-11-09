package RandomClass;

import java.util.*;

public class RandomAndIf {
    public static void main(String[] args) {

        // Guess Number: User is asked to guess a number from 1 to 10
// Write a program that generates a random number and takes a guess from the user.
// > If user guesses correct number they should see “ Congrats you guessed right”
//> If user guess is more than the random number they should see: “your guess is too high”
//> If user guess is less than the random number they should see “your guess it too low”
        Scanner input = new Scanner(System.in);
        int guessNumber= input.nextInt();
        Random random = new Random();
        int number = random.nextInt(10);
        number++; // this is how I get the range to be 1-10
        System.out.println(number);

        if (guessNumber==number){
            System.out.println("Congrats you guessed right");
        } else if (guessNumber >number) {
            System.out.println("Your guess is too high");
        }else if(guessNumber<number){
            System.out.println("Your guess is too low");
        }
    }
}