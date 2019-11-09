package Loop;

import java.util.Scanner;

public class WhileBankAccount {
    public static void main(String[] args) {
//        You have a bank account balance of 1500.
//        You can continue to spend as long as you have money in your account.
//        Write a program that will ask the user to enter the cost of an item.
//        If your balance has enough money for that item complete the purchase and take the money out of the account.
//        If there is not enough money in your account for that item print “Card Declined get a different item”.
//        Allow continuous purchasing until the account becomes 0.
//        When your account has a balance of 0 print “You are broke”
//Flow: (balance of 605)
//  Please enter transaction amount: > 200
//Item Purchased  
// Please enter transaction amount: > 300
//Item Purchased 
// Please enter transaction amount: > 100
//Item Purchased 
// Please enter transaction amount: 5 You are broke.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter transaction amount");
        int balance =1500;
        int transBal;
        int dec=0;

        while (balance>0){
            System.out.println("Please enter transaction amount:");
            transBal=input.nextInt();

            if(transBal<=balance){
                System.out.println("Item Purchased");
                balance-=transBal;
                dec =0;
            }else{
                System.out.println("Card decline");
                dec++;
            }
            if(dec==3){
                System.out.println("Card is locked");
                break;
            }

        }
        if(balance==0){
            System.out.println("You broke");

        }




    }
}