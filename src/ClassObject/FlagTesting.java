package ClassObject;

public class FlagTesting {
    public static void main(String[] args) {

        String name="James";
        FlagObj f1=new FlagObj();

        System.out.println(f1.country);
        f1.country="USA";
        f1.color="Red/white";
        f1.size=5;
        f1.material="wood";

        System.out.println(f1.country);
        f1.flap();

        FlagObj f2= new FlagObj();
        System.out.println(f2.country);
        f2.flap();

        f1.info();
        f2.info();


    }
}
