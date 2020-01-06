package Exceptions;

public class InvalidLocationException extends Exception {



    //Create InvalidLocationException. Make this exception checked.
    //throw this exception from setLocation method if there is any numbers found in the location
    //This Exception should also have message. Overload the constructor.

    public InvalidLocationException(){

    }

    public InvalidLocationException(String message){
        super(message);
    }
}
