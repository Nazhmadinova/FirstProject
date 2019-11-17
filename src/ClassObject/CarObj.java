package ClassObject;

public class CarObj {
    //Create a class Car
    //Instance variables: make, year, sportEdition, mileage
    //Methods:
    //drive -> print “%year %make is driving” -> increment mileage by 10
    //drive -> accepts String(destination) -> print “%year %make is driving to %destination”
    //-> increment mileage by 10
    //drive -> accepts integer(mile) -> print “%year %make is driving %mile miles”
    //-> increment mileage by given mile.

    String make;
    int year;
    boolean sportEdition;
    int mileage;

    public void drive(){
        System.out.println(year+" "+make+" is driving");
        this.mileage+=10;
    }

    public void drive(String destination){
        System.out.println(year+" "+make+" is driving to "+destination);
        this.mileage+=10;
    }

    public void drive(int mile){
        System.out.println(year+" "+make+" is driving "+mile+" miles");
        this.mileage+=mile;
    }
}
