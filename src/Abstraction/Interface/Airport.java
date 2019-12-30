package Abstraction.Interface;

import java.util.ArrayList;
import java.util.List;

public class Airport implements Wifi{
    public static void main(String[] args) {

        System.out.println(Jet.age);
        Jet jet = new Jet();
        jet.getAlt();
        Plane a = new Jet();
        a.takeOff();
        a.a();


    }

    @Override
    public void turnWifiOn() {

    }
}
