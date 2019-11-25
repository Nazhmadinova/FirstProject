package ArrayList;

import Constructor.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    //1. Create a class Store.

    //Instance variables: name, address, list of Item, number of items. Create a constructor that
    // accepts name and address and set both values to corresponding instance variables.

    //Create a method addItem. This method doesn’t return anything and it accepts Item object as parameter.
    // Simply add given Item to the list of items and increment number of items by one.

    //Create a method seeInventory. This method doesn’t take or return anything.
    // It should simply print each and every single item information.
    // Note: You can use info method that Item class has.

    //Modify Store class.
    //Add instance variable totalSales.

    //Create method sellItem. Method accepts name of the Item and doesn’t return anything.
    // Check if name of the item is in the list. If it’s in stock remove from the list and
    // add the price to totalSales and give success transaction message. If doesn’t exist in the list
    // give failed transaction message and terminate the method.

    //Create method returnItem. Method takes item name and doesn’t return anything.
    // Ask user to enter the price of an item. Then create Item object from given information and
    // add to the items list. Also maintain totalSales.

    String name;
    String address;
    ArrayList<Item> items=new ArrayList();
    int numberOfItems;
    double totalSales;



    public void returnItem(String name){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the price of the item");
        int price=input.nextInt();

        Item item=new Item(name,price);
        items.add(item);
        this.totalSales-=price;
        this.numberOfItems++;
        System.out.println("Total sales: "+ totalSales);
    }

    public Store(String name, String address){
        this.name=name;
        this.address=address;
    }

    public void addItem(Item item){
       this.items.add(item);
       this.numberOfItems++;

    }

    public void addItem(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number of items:");
        int num=input.nextInt();
        for(int i=0; i<num;i++){
            input.nextLine();
            System.out.println("Enter item name:"+(i+1));
            String itemName=input.nextLine();
            System.out.println("Enter item price:"+(i+1));
            double price=input.nextInt();
            Item item=new Item(itemName,price);
            this.items.add(item);
            this.numberOfItems++;
        }
    }
    public void sellItem(String name){
        for(int i=0;i<items.size();i++){
            if(items.get(i).name.equals(name)){
                this.totalSales+=items.get(i).price;
                items.remove(items.get(i)); // items.remove(i);
                System.out.println("Success transaction");
                System.out.println("Total sale "+totalSales);
                this.numberOfItems--;
                return; //terminating the method;
            }
        }
        System.out.println("Failed transaction");

    }

    public void seeInventory(){
        //for each loop
        //for(Item item: items){
        // item.info();}
        for(int i=0; i<items.size();i++){
            items.get(i).info();
        }
        System.out.println(items.size());
    }
}
