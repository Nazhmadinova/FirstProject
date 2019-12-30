package Abstraction.Interface;

public class Jet extends Plane implements Wifi, GoodFood{

    @Override
    public void getFood() {
    }

    @Override
    public void turnWifiOn() {

    }

    @Override
    public void takeOff() {

    }

    @Override
    public boolean isEatable() {
        return false;
    }

}
