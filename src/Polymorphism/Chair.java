package Polymorphism;

public abstract class Chair {
    String model;
    double weight;
    String color;

    public abstract void sit();

    public abstract void stepOnIt();

    public void changeColor(String color){
        this.color = color;
    }

}
