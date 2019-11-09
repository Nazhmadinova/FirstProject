package VoidMethods.DataTransferMultipleDataTransfer;

public class FirstEx {
    public static void main(String[] args) {
        printName("James");
        printName("Adam");
        firstChar("Zhaina");
        goTo("Chicago","Almaty");
        makeEmail("Zhaina","Nazhmadinova",23);
    }

    public static void printName(String name){
        System.out.println(name);
    }

    public static void firstChar(String name){
        System.out.println(name.charAt(0));
    }

    public static void goTo(String origin, String newLocation){
        System.out.println("you start from " +origin);
        System.out.println("And you are going to "+ newLocation);
    }
    public static void makeEmail(String firstName, String lastName, int age){
        String email =firstName+age+lastName+"@cybertek.com";
        System.out.println(email);
    }
}
