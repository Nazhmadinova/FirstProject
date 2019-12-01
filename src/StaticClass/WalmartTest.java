package StaticClass;

public class WalmartTest {
    public static void main(String[] args) {
        Walmart w1 = new Walmart();
        Walmart w2 = new Walmart();
        Walmart w3 = new Walmart();
        w1.ceo="Mr.Doug";
        System.out.println(w2.ceo);
        Walmart.ceo="Jason";
        System.out.println(w2.ceo);
    }
}
