package ClassObject;

public class FlagTest {
    public static void main(String[] args) {
        // Create 2 Flag objects
        // Set all values to first one only
        //and copy firs objects instance variable values to second one
        //and reset the first objects values to zero to numbers and "a" to String.

        FlagObj f1=new FlagObj();
        f1.country="KZ";
        f1.material="cotton";
        f1.color="blue";
        f1.size=2;

        FlagObj f2=new FlagObj();
        f2.country=f1.country;
        f2.material=f1.material;
        f2.color=f1.color;
        f2.size=f1.size;

        f1.country="a";
        f1.material="a";
        f1.color="a";
        f1.size=0;

        f1.upgrade(255,"gold");

        f1.info();
        f2.info();



    }
}
