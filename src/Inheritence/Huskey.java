package Inheritence;

import Constructor.Item;
import org.w3c.dom.ls.LSOutput;

public class Huskey extends Dog implements Trainable{

    public static String zh = "Zhaina2";
    @Override
    public void fetch(Item item) {
        System.out.println("Huskey is fetching " + item.name);
    }

    @Override
    public void play() {

    }

    @Override
    public void bark(){
        super.bark();
    }

    @Override
    public void barkOnCommand() {
    }

    String furType;
    public void liveInCold(){
        System.out.println("Huskey is living in the cold weather");
    }

    public static void main(String[] args) {
        Huskey huskey = new Huskey();
        Dog dog = new Dog();
        System.out.println(dog.zh);
        System.out.println(zh);
    }
}
