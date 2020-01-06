package Exceptions;

public class InvalidLocationExceptionTest {

    public static void main(String[] args) {

        Driver d = new Driver();
        d.setName("Kevin h ");

        System.out.println(d.getName());

        try{
            d.setLocation("Chicago");
        }catch (InvalidLocationException e){

        }finally {
            System.out.println(d.getName());
            System.out.println(d.getLocation());
        }

    }
}
