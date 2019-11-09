package Array;

import java.util.Arrays;

public class Task2Prices {
    public static void main(String[] args) {
        //Declare and initialize double array for prices.
        //Store following prices:
        //45.99, 23.5, 11.50, 33.33, 99.99.
        //Print the values then change the last element to 112.89.
        //Print all values again

        double[]prices= new double[5];
        prices[0]=45.99;
        prices[1]=23.5;
        prices[2]=11.50;
        prices[3]=33.33;
        prices[4]=99.99;
        System.out.println(Arrays.toString(prices));
        prices[4]=112.89;
        System.out.println(Arrays.toString(prices));

        // double []prices={45.99, 23.5, 11.50, 33.33, 99.99};
        //System.out.println(Arrays.toString(prices))
        //prices[prices.length-1]=112.89;
        //System.out.println(Arrays.toString(prices))


    }
}
