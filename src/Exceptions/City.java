package Exceptions;

public class City {

    public static void main(String[] args){
        System.out.println("Hi");
        Driver d = new Driver();
        try {
            d.setName("james bond");
            System.out.println("Buy");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("kjhgkj");

        System.out.println(d.getName());
    }
}
