package AbstractClass;

public abstract class Home {
    //Abstract class Home.
    //Instance variables: numOfRooms, address, maxNumOfGuests;
    int numOfRooms;
    String address;
    int maxNumOfGuests;

    //Methods: throwParty, lock, unlock, cook.
    public abstract void throwParty();
    public abstract void lock();
    public abstract void unlock();
    public abstract void cook();

    //Override toString method. Build and return all info about Home.

    @Override
    public String toString(){
        return "Number of rooms: "+numOfRooms +"\nAddress: "+address+"\nNumber of guests: "+maxNumOfGuests;
    }
    //Concrete classes: Apartment, Townhouse, SingleHouse.

}
