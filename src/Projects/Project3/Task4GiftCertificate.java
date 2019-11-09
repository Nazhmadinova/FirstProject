package Projects.Project3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task4GiftCertificate {
    public static void main(String[] args) {
        //Imagine that you have won a $100 gift certificate in a contest.
        // You must spend the money in a particular store, but you can buy at most only three items.
        // The store's computer tracks the amount of money you have left to spend
        // as well as the number of items you have bought. Each time you choose an item,
        // the computer will tell you whether you can buy it. We want to write a program
        // for the computer so that both the dollar amount available and the number of items you can
        // buy are easily changed. So, you will continue buying as long as you have enough money and have bought
        // fewer than three times.
        //You may buy up to 3 items costing no more than $100

        //Example 1:
        //Enter cost of item: 70
        //You spent $70 so far
        //You may buy up to 2 items
        //Enter cost of item: 30
        //You bought 2 items, spent $100 and done shopping

        //Example 2:
        //Enter cost of item: 40
        //You spent $40 so far
        //You may buy up to 2 items
        //Enter cost of item: 20
        //You spent $60 so far
        //You may buy up to 1 items
        //Enter cost of item: 10
        //You bought 3 items, spent $70 and done shopping

        //Example 3:
        //Enter cost of item: 30
        //You spent $30 so far
        //You may buy up to 2 items
        //Enter cost of item: 60
        //You spent $90 so far
        //You may buy up to 1 items
        //Enter cost of item: 10
        //You bought 3 items, spent $100 and done shopping

        //Example 4:
        //Enter cost of item: 30
        //You spent $30 so far
        //You may buy up to 2 items
        //Enter cost of item: 90
        //You can't spend more than $100
        //Enter cost of item: 70
        //You bought 2 items, spent $100 and done shopping
        Scanner input=new Scanner(System.in);
        int count=0;
        int sum=0;
        while(count<4 && sum<100){
            System.out.print("Enter cost of item: ");
            int cost=input.nextInt();
            sum+=cost;
            count++;
            if(sum>100){
                System.out.println("You can't spend more than $100");
                sum=sum-cost;
                count--;
                continue;
            }
            if(count<3 && sum<100){
                System.out.println("You spent $" +sum+" so far");
                System.out.println("You may buy up to "+ (3-count)+" items");
            }
            if(sum==100){
                System.out.println("You bought " + count + " items, spent $100 and done shopping");
                break;
            }
            if(count==3){
                System.out.println("You bought 3 items, spent $"+  sum +" and done shopping");
                break;
            }
        }
    }
}
