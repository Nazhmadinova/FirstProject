package StringManipulation;

public class Car {
    public static void main(String[] args) {
        //You have a car garage with these car brands.
        // You will check the cars and print the following messages:
        // String cars ="Toyota, BMW, Juguar";
        // > If the garage is empty print “No cars in your garage”
        // > If you have a Toyota or Nissan print “There is a Japanese car in your garage”
        // > If you have a BMW print “There is a German car in your garage”
        // > If you have a Maserati print “There is an Italian car in your garage”
        // > If you have a Jaguar print “There is a British car in your garage”
        // —> If the garage does not have a car of that type, print “No x cars”

        String cars = "Toyota, BMW, Juguar,maserati";
        cars = cars.toLowerCase();
        if(cars.isEmpty()) {
            System.out.println("Garage is empty");
        }
        if(cars.contains("toyota") || cars.contains("nissan")) {
            System.out.println("There is a Japanese car in your garage");
        } else {
            System.out.println("There is no Japanese car in your garage");
        }
        if(cars.contains("bmw")) {
            System.out.println("There is a German car in your garage");
        } else {
            System.out.println("There is no German car in your garage");
        }
        if(cars.contains("maserati")) {
            System.out.println("There is a Italian car in your garage");
        } else {
            System.out.println("There is no Italian car in your garage");
        }
        if(cars.contains("jaguar")) {
            System.out.println("There is a British car in your garage");
        } else {
            System.out.println("There is no British car in your garage");
        }
    }
}
