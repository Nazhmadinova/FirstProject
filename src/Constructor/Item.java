package Constructor;

public class Item {
    //Create a class Item that has instance variables name and price.
    //Create a constructor that sets both the name and the price.
    //Create a method that will print the name of the item and the price



    public String name;
    public double price;

    public Item(String name, double price){
        this.name=name;
        this.price=price;
    }

    public void info(){
        System.out.println(name);
        System.out.println(price);
    }
}
