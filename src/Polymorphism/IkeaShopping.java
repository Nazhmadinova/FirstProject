package Polymorphism;

import MutableImmutable.A;

public class IkeaShopping {

    public static void main(String[] args) {

        Chair c = new Aeron();
        c.sit();

        Aeron b = (Aeron) c;
        b.changeColor("blue");
        b.ley();

        Rollable r = (Rollable) c;
        r.roll();

        // Casting in Polymorphism: switching from Chair to Aeron type.
        // Because it is allowed normally
        Aeron a = new Aeron();
        Collapsible co = new Humanscale();
        co.unfold();


        Humanscale h = new Humanscale();
        h.rollBack();

        Chair chair = new Humanscale();
        chair.sit();


    }
}
