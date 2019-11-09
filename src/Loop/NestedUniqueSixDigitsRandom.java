package Loop;

import java.util.Random;

public class NestedUniqueSixDigitsRandom {
    public static void main(String[] args) {
//Generate a random number that is six digits long. Each digit in this number should be unique,
// meaning the number 6 digit number should have 6 different character numbers that make it up.
// Print the number.

        Random random = new Random();
        String number="";

        for(int i=0; i<6; i++){
            int ranNum = random.nextInt(10);

            while(number.contains(ranNum + "")) {
                ranNum = random.nextInt(10);
            }
            number+=ranNum;
        }
        System.out.println(number);





    }
}
