package InheritencePart2;

public class Macbook extends Laptop{
    static int numOfLaptops;

    public Macbook(){
        super("Apple");
    }

    public void appleID(){
        super.memorySize = 45;

    }


    private void a() {

    }

        public static void main(String[] args) {
        Macbook macbook = new Macbook();
        macbook.color = "Grey";
        Macbook.numOfLaptops = 23;
        System.out.println(Macbook.numOfLaptops);
        System.out.println(Laptop.numOfLaptops);

    }
}
