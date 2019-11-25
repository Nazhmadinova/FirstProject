package ArrayList;

import Constructor.Item;

public class StoreTest {
    public static void main(String[] args) {
        Store first=new Store("Zhaina","Chicago");
 //       first.addItem();
        Item item1=new Item("Socks",15);
        Item item2=new Item("coat",89);
        Item item3=new Item("bottle of water",5);
        first.addItem(item1);
        first.addItem(item2);
        first.addItem(item3);
        first.seeInventory();
        System.out.println(first.numberOfItems);

        first.sellItem("coat");
        first.returnItem("coat");

        
    }
}
