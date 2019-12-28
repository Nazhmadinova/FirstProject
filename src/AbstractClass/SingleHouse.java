package AbstractClass;

public class SingleHouse extends Home {

    //SingleHouse additional variable: garageType.
    String garageType;

    @Override
    public void throwParty() {
        System.out.println("Throw the party");
    }

    @Override
    public void lock() {
        System.out.println("Closing the door");
    }

    @Override
    public void unlock() {
        System.out.println("Opening the door");
    }

    @Override
    public void cook() {
        System.out.println("Cooking at single house");
    }

    //SingleHouse additional methods: cutGrass, shovelSnow.
    public void cutGrass(){
        System.out.println("Cutting grass in single house");
    }

    public void shovelSnow(){
        System.out.println("Shoveling the snow in Single House");
    }

    @Override
    public String toString(){
        return super.toString()+"\nType of garage: "+ garageType;
    }
}
