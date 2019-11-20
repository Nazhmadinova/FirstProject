package Constructor;

import java.util.Scanner;

public class ItemTest {
    //Create a program that will ask user to enter how many items they have. Ask from the user to enter
    // all the names and prices of each item. Make an Item array that will hold all the items.

    //After you have the array loop through it and print the information of all the items

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("How many items you have:");
        int size=input.nextInt();
        input.nextLine();
        Item [] items=new Item[size];

        for(int i=0;i<items.length;i++){
            System.out.println("Item name "+(i+1));
            String name =input.nextLine();
            System.out.println("Prices of item: "+(i+1));
            double price=input.nextInt();
            input.nextLine();

            items [i]=new Item(name,price);
        }

        for(Item each: items){
            each.info();
        }

    }
}
