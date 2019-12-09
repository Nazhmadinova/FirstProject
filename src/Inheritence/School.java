package Inheritence;

public class School {
    //Create a class School. 
    //instance variables: name, address, type 
    String name;
    String address;
    String type;

    //create a method giveHW. Method doesn’t take anything or return anything.
    // Simply print “%schoolName is giving home work”. 

    public void giveHW(){
        System.out.println(this.name+" is giving home work");
    }
    //Create method hostEvent. Void method and accepts date. This method should print “Hosting an event on %date”.
    public void hostEvent(String date){
        System.out.println("Hosting an event on "+date);
    }

}
