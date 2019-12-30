package Polymorphism;

import MutableImmutable.A;

public class IkeaShopping {

    public static void main(String[] args) {

        Chair c = new Aeron();
        c.sit();
        // Casting in Polymorphism: switching from Chair to Aeron type.
        // Because it is allowed normally
        Aeron a = new Aeron();
        Collapsible co = new Humanscale();
        co.unfold();

    }
}
