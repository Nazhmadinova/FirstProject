package Loop;

public class forInfinite {

    public static void main(String[] args) {
        for(int i = 0; i < 10; ){
            i = ++i;
            System.out.println("hello " + i);
        }
    }
}