package Exceptions;

public class LaptopNotTurningOnException extends RuntimeException {

    public LaptopNotTurningOnException(){

    }

    public LaptopNotTurningOnException(String message){
        super(message);
    }
}
