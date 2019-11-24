package ArrayList;

import Constructor.Item;

import java.util.ArrayList;

public class Store {
    //1. Create a class Store.

    //Instance variables: name, address, list of Item, number of items. Create a constructor that
    // accepts name and address and set both values to corresponding instance variables.

    //Create a method addItem. This method doesn’t return anything and it accepts Item object as parameter.
    // Simply add given Item to the list of items and increment number of items by one.

    //Create a method seeInventory. This method doesn’t take or return anything.
    // It should simply print each and every single item information.
    // Note: You can use info method that Item class has.

    String name;
    String address;
    ArrayList<Item> items=new ArrayList();
    int numberOfItems;

    public Store(String name, String address){
        this.name=name;
        this.address=address;
    }

    public void addItem(Item item){
       this.items.add(item);
       this.numberOfItems++;

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
