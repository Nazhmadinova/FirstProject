package Abstraction.Interface;

public class Jet extends Plane implements Wifi, GoodFood{

    protected static int a;

    protected static void d(){

    }

    @Override
    public void getFood() {
        System.out.println(num);
        System.out.println(GoodFood.num);
        System.out.println(GoodFood.staticMethod());
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
