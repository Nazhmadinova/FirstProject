package StaticClass;

public class MouseTest {
    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        Mouse m2 = new Mouse();
        m1.color = "White";
        System.out.println(m2.color);
        Mouse m3 = m2;
        m2 = m1;
        System.out.println(m2.color);
        System.out.println(m3.color);
    }
}
