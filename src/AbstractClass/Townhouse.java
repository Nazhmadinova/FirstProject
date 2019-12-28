package AbstractClass;

public class Townhouse extends Home {
    ////Townhouse additional methods: shareWithNeighbor.
    public void shareWithNeighbor(){
        System.out.println("Sharing");
    }

    @Override
    public void throwParty() {
        System.out.println("Throwing a party in Townhouse");
    }

    @Override
    public void lock() {
        System.out.println("Locking my Townhouse");
    }

    @Override
    public void unlock() {
        System.out.println("Opening my townhouse");
    }

    @Override
    public void cook() {
        System.out.println("Cooking something at my townhouse");
    }
}
