package Projects.Project3;

import java.util.Arrays;
import java.util.Scanner;

public class Task2RightSolution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        // to keep days use do while loop
        // create days for keeping days
        // sumOfppl for counting
        // for loop first dividing next days
        // next for loop for copying all the values
        // check while loop if there is sumOfppl


        //TODO. Write you code below this line.
        // days i use for counting days
        // sumOfppl => used for counting sumOfpp
        //
        // if first index is ZERO
        // if last index is ZERO
        // if middle index is ZERO

        // i use do while loop in order to count days

        // int [] array = new array[inhabitants.length];

        // for(int i=0; i<inhabitants.length; i++){
        //   array[i]=inhabitants[i];
        // }


        int day =0;
        int sumOfppl=0;

        int [] nextDay=inhabitants;

        System.out.println("Day "+day+ " "+Arrays.toString(inhabitants));

        do{

            day++;
            sumOfppl=0;

            for(int i=0; i<inhabitants.length; i++){

                if(i!=0&&i!=inhabitants.length-1&& inhabitants[i]==0){
                    nextDay[i-1] = inhabitants[i-1]/2;
                    nextDay[i+1] =inhabitants[i+1]/2;
                }

                if(i==0&&inhabitants[i]==0){
                    nextDay[i+1]=inhabitants[i+1]/2;
                }

                if(i==inhabitants.length-1&&inhabitants[i]==0){
                    nextDay[i-1] = inhabitants[i-1]/2;
                }


            }
            System.out.println("Day "+day+ " "+Arrays.toString(nextDay));

            for(int i=0; i<inhabitants.length; i++){
                inhabitants[i]=nextDay[i];
                sumOfppl+=inhabitants[i];
            }


        }while(sumOfppl!=0);

        System.out.println("---- EXTINCT ----");

    }
}
