package ReturnMethods;

public class Weekday {
    //Write a method that will tell you if it is the weekday or not.
    // The method takes a String, Saturday and Sunday are the only weekend days
    public static boolean weekday(String day){
        if(day.equalsIgnoreCase("Saturday") && day.equalsIgnoreCase("Sunday")){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(weekday("Monday"));
    }
    //other way

    public static boolean isWeekday(String day){
        day =day.toLowerCase();

        switch (day){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                return true;
            case "saturday":
            case "sunday":
                return false;
            default:
                System.out.println("Invalid day provided");
                return false;
        }
    }
}
