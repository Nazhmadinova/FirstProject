package Exceptions;

import java.io.IOException;

public class ThrowsExp {

    public static void main(String[] args) throws InterruptedException, IOException {

        Dog dog = new Dog();
        try {
            dog.setAge(40);
        } catch (DogNotBarkableException e) {
            System.out.println("Invalid age");
        }
        System.out.println(dog.age);
    }



}
