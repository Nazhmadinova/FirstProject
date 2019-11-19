package Constructor;

public class Class {
    //Create a class Phone.
    //Instance variables: touchscreen, model, memory, color, phoneNumber.
    //Create a constructor that accepts two parameters(model, color) and set to corresponding instance variables.
    // Overload the constructor that accepts 4 parameters(model, color, memory, touchscreen).
    // Set values and check memory. If given memory is negative value then print “invalid memory”
    // and don’t set memory value. Otherwise set the memory value.

    boolean touchscreen;
    String model;
    int memory;
    String color;
    long phoneNumber;

    public Class(String model, String color){
        this.model=model;
        this.color=color;
    }

    public Class(String model, String color, int memory, boolean touchscreen){
        this.touchscreen=touchscreen;
        this.model=model;
        this.color=color;
        if(memory>=0){
            this.memory=memory;
        }else{
            System.out.println("Invalid memory");
        }
    }
}
