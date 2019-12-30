package Polymorphism;

public class Humanscale extends Chair implements Rollable, Collapsible{

    @Override
    public void lock() {

    }

    @Override
    public void unlock() {

    }

    @Override
    public void fold() {

    }

    @Override
    public void unfold() {
        System.out.println("HumanScale is unfolding");
    }

    @Override
    public void rollBack() {

    }

    @Override
    public void rollForward() {

    }

    @Override
    public void sit() {
        System.out.println("sitting on Humanscale chair");
    }

    @Override
    public void stepOnIt() {
        System.out.println("stepping on Humanscale chair");
    }
}
