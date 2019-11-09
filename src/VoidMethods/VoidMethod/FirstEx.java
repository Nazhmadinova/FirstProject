package VoidMethods.VoidMethod;

public class FirstEx {
    public static void main(String[] args) {
       sayHi();

       sayHi();
    }
    public static void sayHi() {
        System.out.println("Hi");
        sayBye();
    }

    public static void sayBye(){
        System.out.println("bye");
    }
}
