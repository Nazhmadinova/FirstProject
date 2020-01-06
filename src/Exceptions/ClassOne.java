package Exceptions;

public class ClassOne {
    public static void main(String[] args) {
        String s = "hello";
      //  System.out.println(s.charAt(30));
       // Thread.sleep(1000);
        //Dog.bark();

//        try{
//            System.out.println("Hi");
//            Dog.bark();
//            String str = "Hello";
//            System.out.println(str.charAt(30));
//        }catch (Exception e){ // or StringIndexOutOfBoundException
//            System.out.println("Exception is thrown");
//            System.out.println("Buy");
//        }
//        System.out.println("The end");


        try{

            String str = "Hello";
            System.out.println(str.charAt(3));
            System.out.println(3/0);
            System.out.println(str.charAt(30));
            System.out.println(new int []{3,21,1}[5]);
        }catch (StringIndexOutOfBoundsException e){ // or StringIndexOutOfBoundException
            System.out.println("hi");
        }catch (ArithmeticException e){
            System.out.println(e.toString());
            System.out.println("buy");
        }catch (Exception e){
            System.out.println("Unknown exception");
        }
        System.out.println("The end");

//        try{
//            Thread.sleep(1000);
//            Dog d = null;
//            int a = d.age;
//        }catch (InterruptedException e){
//
//        }

    }
}
