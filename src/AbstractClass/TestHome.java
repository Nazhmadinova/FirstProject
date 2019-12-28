package AbstractClass;

public class TestHome {
    public static void main(String[] args) {
        SingleHouse singleHouse = new SingleHouse();
        singleHouse.garageType = "Regular";
        singleHouse.address = "132 main st";
        singleHouse.numOfRooms = 5;
        singleHouse.maxNumOfGuests = 20;
        singleHouse.cook();
        singleHouse.cutGrass();
        singleHouse.lock();
        singleHouse.shovelSnow();
        singleHouse.throwParty();
        singleHouse.unlock();
        System.out.println(singleHouse.toString());
    }
}
