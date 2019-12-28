package AbstractClass;

public class Apartment extends Home {

    @Override
    public void throwParty() {
        System.out.println("Throwing a party in Apartment");
    }

    @Override
    public void lock() {
        System.out.println("Locking my Apartment");
    }

    @Override
    public void unlock() {
        System.out.println("Opening my apartment");
    }

    @Override
    public void cook() {
        System.out.println("Cooking something at my apartment");
    }
}
