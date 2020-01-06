package Polymorphism;

public class Dog extends Animals {
    String type;

    int dogInt;

    @Override
    public void breath(){
        System.out.println("Dog is breathing");
    }

}
