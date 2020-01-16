package Exceptions;

import java.util.Random;

public class Laptop {

    private String os;

    public boolean turnOn(){
        Random random = new Random();
        int num = random.nextInt(11);
        System.out.println(num);
        if(num >= 1){
            throw new LaptopNotTurningOnException();
        }

        return true;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) throws InvalidOSException {

        switch (os.toLowerCase()){
            case "windows":
            case "mac":
            case "linox":
                this.os = os;
                break;
            default:
                throw new InvalidOSException(os + " is not a valid OS");
        }

    }
}
