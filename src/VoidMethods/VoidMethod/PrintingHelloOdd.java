package VoidMethods.VoidMethod;

//Create a method that prints “Hello” 50 times
//Create a method that print odd numbers up to 100.

public class PrintingHelloOdd {
    public static void main(String[] args) {
       hello();
       odd();
    }
    public static void hello(){
        for(int i=1;i<=50;i++){
            System.out.println("Hello "+i);
        }
    }
    public static void odd(){
        for(int i=0;i<=100;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }

    }

}
