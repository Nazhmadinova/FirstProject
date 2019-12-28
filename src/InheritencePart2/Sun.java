package InheritencePart2;

public class Sun extends Object{
    public Sun(){
        super();
    }

    public static void main(String[] args) {
        Lenova lenova = new Lenova();
        lenova.model = "Lenova X4";
        lenova.memorySize = 512;
        lenova.color = "Grey";

        lenova.turnOn();

        Macbook macbook = new Macbook();
        macbook.turnOn();

    }
}
