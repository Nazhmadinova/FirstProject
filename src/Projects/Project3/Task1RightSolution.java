package Projects.Project3;

import java.util.Arrays;
import java.util.Scanner;

public class Task1RightSolution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        int day=0;
        int sumOfppl=0;
        System.out.println("Day "+day+" "+ Arrays.toString(inhabitants));
        do{
            day++;
            sumOfppl=0;

            for(int i=0; i<inhabitants.length; i++){

                inhabitants[i]= inhabitants[i]/2;
                sumOfppl+=inhabitants[i];

            }

            System.out.println("Day "+day+" "+Arrays.toString(inhabitants));

        }while(sumOfppl!=0);

        System.out.println("---- EXTINCT ----");
    }
}
