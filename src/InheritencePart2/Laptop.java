package InheritencePart2;

import Inheritence.Dog;

public class Laptop {
    public Laptop(String model){
        this.model = model;

        System.out.println("Laptop constructor");
    }

    public Laptop(){
        System.out.println("Hi");

    }

    public Dog getMyDog(){
        System.out.println("Returning some dog");
        Dog dog = new Dog();
        return dog;
    }

    public static void s(){

    }

    private int num;

    private void a(){

    }

    String model;
    int memorySize;
    protected String color;
    public static int numOfLaptops = 8;

    public void turnOn(){
        System.out.println("Laptop is turning on");
    }

}
