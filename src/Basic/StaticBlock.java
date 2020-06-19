package Basic;

public class StaticBlock {

    static int num;

    static {
        num = 10;
        System.out.println("Static block");
    }

}
