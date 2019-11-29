package StaticClass;

public class LexusTest {
    public static void main(String[] args) {
        Lexus car1= new Lexus("Lexus",2018);
        Lexus car2= new Lexus("Lexus",2015);
        car1.mileage=2000000;
        Lexus.evaluateCar(car1);

        System.out.println(Lexus.totalNumOfLexus);
    }
}
