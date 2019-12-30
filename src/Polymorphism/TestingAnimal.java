package Polymorphism;

public class TestingAnimal {
    public static void main(String[] args) {

        GermanShephard germanShephard = new GermanShephard();
        Animals dog = new Dog();
        String s = dog.type;
        dog.breath();

        Trainable dog2 = new GermanShephard();
        dog2.bark();
        String name = dog2.name;

        Animals dog3 = new GermanShephard();
        Trainable dog4 = (Trainable)dog3;

       Animals joe = new GermanShephard();
        Dog joe2 = (Dog)joe;
        GermanShephard joe3 = (GermanShephard)joe;
        GermanShephard joe4 = (GermanShephard)joe2;
        Trainable joe5 = (Trainable)joe;
        joe3.a();
        joe.breath();

        int age2 = ((GermanShephard)joe).age;
        ((GermanShephard)joe).bark();

    }
}
