package ClassObject;

public class CarTesting {
    public static void main(String[] args) {
        CarObj car1=new CarObj();
        car1.make="Toyota";
        car1.year=2016;
        car1.sportEdition=true;
        car1.mileage=1000;

        car1.drive();
        System.out.println(car1.mileage);
        car1.drive("Chicago");
        System.out.println(car1.mileage);
        car1.drive(5);
        System.out.println(car1.mileage);
    }
}
