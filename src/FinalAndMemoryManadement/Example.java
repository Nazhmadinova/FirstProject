package FinalAndMemoryManadement;

public class Example {
    final String name ="Jason";
    final String color;
    final static int totalBags;

    static {
        totalBags =45;
    }

    public Example(){
        this.color = "red";
    }

    public static void main(String[] args) {
        final int k;
        k = 23;
        System.out.println(k);
       Example obj = new Example();
        System.out.println(obj.name);
    }

    public Example(String color){
        this.color = color;

    }

}
