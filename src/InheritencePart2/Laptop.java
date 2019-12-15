package InheritencePart2;

public class Laptop {
    public Laptop(String model){
        this.model = model;

        System.out.println("Laptop constructor");
    }

    public Laptop(){
        System.out.println("Hi");
    }

    String model;
    int memorySize;
    protected String color;
    public static int numOfLaptops = 8;

    public void turnOn(){
        System.out.println("Laptop is turning on");
    }

}
