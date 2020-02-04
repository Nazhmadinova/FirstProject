package Polymorphism;

public class Aeron extends Chair implements Rollable{

    @Override
    public void rollBack() {

    }

    @Override
    public void rollForward() {

    }

    @Override
    public void sit() {
        System.out.println("Sitting on Aeron chair");
    }

    @Override
    public void stepOnIt() {
        System.out.println("stepping on Aeron chair");
    }

    public void ley(){

    }
}
