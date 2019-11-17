package ClassObject;

public class FlagObj {

    String country;
    int size;
    String color;
    String material;

    public void flap(){
        System.out.println("Flag is flapping");
    }

    public void info(){
        System.out.println("Country: "+country);
        System.out.println("Size: "+size);
        System.out.println("Color: "+color);
        System.out.println("Material: "+material);
    }

    // Create a method called upgrade
    //Method should accept int for size and String for material.
    //Method upgrade should reassign the current
    //size and material with given new values

    public void upgrade(int size, String material){
        this.size=size;
        this.material=material;

    }

}
