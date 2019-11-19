package ClassObject;

import java.util.Scanner;

public class HouseObj {
    //Part I 
    //Create a class House 
    //Instance variables: type, address, numRooms
    //Methods:
    //info: this method should simply print details of house.
    //Part II
    //Create a program that asks from user details of the house through console and create object from House.
    // And print the details of created House.

    String type;
    String address;
    int numRooms;

    public void info(){
        System.out.println("Type is "+type);
        System.out.println("Address is "+address);
        System.out.println("Number of rooms "+numRooms);
    }

}
