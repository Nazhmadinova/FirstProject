package Exceptions;

public class LaptopTest {
    public static void main(String[] args){
        Laptop laptop = new Laptop();
        System.out.println("hi");
        //laptop.setOs("ma");


        try {
            laptop.setOs("mac");
            laptop.turnOn();
        } catch (InvalidOSException | LaptopNotTurningOnException e) {
            e.printStackTrace();
        }

    }
}
