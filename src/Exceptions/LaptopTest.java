package Exceptions;

public class LaptopTest {
    public static void main(String[] args){
        Laptop laptop = new Laptop();

        try {
            laptop.setOs("mac");
            laptop.turnOn();
        } catch (InvalidOSException | LaptopNotTurningOnException e) {
            e.printStackTrace();
        }

    }
}
