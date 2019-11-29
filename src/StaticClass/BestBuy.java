package StaticClass;

public class BestBuy {
    String location;
    static int numOfComputers; // now numOfComputers for all stores will be same because of static
    static String day;


    public BestBuy(String location, String day){
        this.location = location;
        this.day = day;
    }

    static {
        System.out.println("Fist");
        numOfComputers=50;
        day = "Monday";
    }

    static {
        numOfComputers=100;
        System.out.println("second");
        if(day.equals("Monday")){
            numOfComputers = 60;
        }else{
            numOfComputers = 20;
        }
    }

    public static void numberOfComputers(){
        System.out.println(numOfComputers);
    }
}
