package Polymorphism;



public class GermanShephard extends Dog implements Trainable{

    int age;

    @Override
    public void breath(){
        System.out.println("GermanShepherd is breathing");
    }

    @Override
    public void bark(){

    }
}
