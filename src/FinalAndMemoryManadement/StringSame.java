package FinalAndMemoryManadement;

public class StringSame {
    public static void main(String[] args) {
        String name = "Jason";
        String str = "Jason";
        System.out.println(name == str); // it means two string have a same address
        System.out.println(name.hashCode());
        System.out.println(str.hashCode());
        String str2 = new String();
        str2 = "Jason";
        String str3 = new String("Jason");
        System.out.println(name == str2);
        //System.out.println(str2 == str3);

        String s = "ghf";  // s - goes to stack, "ghf" - goes to heap
        System.out.println(str2);

        Bag bag = new Bag(); // this actual object is gone to GC
        Bag bag1 = new Bag();
        bag = bag1;
        System.gc(); // calling a GC

    }
}
