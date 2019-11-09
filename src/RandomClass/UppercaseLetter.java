package RandomClass;

import java.util.Random;

public class UppercaseLetter {
    public static void main(String[] args) {
        // write a program that will generate a random uppercase letter.Print the letter.

  //      Random random =new Random();
 //       To generate a random char in a-z:
 //      char num = (char)(random.nextInt(26)+'a');
 //       If we want uppercase:
 //       char b = (char)(random.next(26)+'A');
//        if: char num = (char)(random.nextInt(91));
//         it is gonna show Letters and other characters till "A"(till 65)
//        System.out.println(num);
        Random random = new Random();
        int number = random.nextInt(26); // we have 26 letters
        System.out.println("Random Num: " + number);
        number+=65; // uppercase A starts from 65 till Z 90
        char letter =(char)(number);
        System.out.println("My number is " +number);
        System.out.println("your letter " +letter);

    }
}
