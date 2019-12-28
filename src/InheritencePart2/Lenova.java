package InheritencePart2;

import Inheritence.Dog;
import Inheritence.Huskey;
import Inheritence.Sss;

public class Lenova extends Laptop {

    public static void s(){ // if you pass some parameter it will not be overriding,
        // it is gonna be method hiding for static method
        System.out.println();
    }

    @Override
    public void turnOn(){
        super.turnOn();
        System.out.println(this.model+" Laptop is turning on!");
    }

    @Override
    public Sss getMyDog(){
        return null;
    }
}
