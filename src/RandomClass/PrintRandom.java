package RandomClass;

import java.util.Random;

public class PrintRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println(number);
    }
}
