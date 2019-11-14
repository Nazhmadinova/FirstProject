package ArrayMultidimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner2D {
    public static void main(String[] args) {
        //Create a program that will ask the user to enter how many groups they have.
        // Then ask the user to enter how many students are in each group. Allow the user to enter each name
        // of the people in each group. Print the 2D array of all the groups at the end

        Scanner input= new Scanner(System.in);
        System.out.println("Enter how many groups we have:");
        int group= input.nextInt();
        input.nextLine();

        String [][] arr= new String[group][];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter how many students are in " +(i+1)+ " group:");
            int students=input.nextInt();
            input.nextLine();

            String [] groups = new String[students];
            for(int j=0;j<groups.length;j++){
                System.out.println("Enter name "+(j+1));
                groups[j]=input.nextLine();
            }
            arr[i]=groups;

        }
        System.out.println(Arrays.deepToString(arr));

    }
}
