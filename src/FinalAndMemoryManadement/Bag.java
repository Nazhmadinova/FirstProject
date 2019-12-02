package FinalAndMemoryManadement;

public class Bag {
    final String color;
    final int size;

    {
        size = 4;
    }

    public Bag(){
        color = "red";

    }

    public Bag(final String color){
        this.color = color;
    }
}
