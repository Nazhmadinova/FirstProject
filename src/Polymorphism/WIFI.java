package Polymorphism;

public interface WIFI {

    void searchWiFI();

    static void m(){
        System.out.println("Static Method");
    }

    default void d(){

    }

}
