package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestAnimal {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, true));

        print(animals, a -> a.canHop());
        print(animals, a -> a.canSwim());
        animals.removeIf(a -> a.toString().charAt(0) != 'a');

    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
            System.out.print(animal + " ");
        }
        System.out.println();
    }

// if you wanna use just one interface
//    private static void print(List<Animal> animals, CheckAnimalTrait checker) {
//        for (Animal animal : animals) {
//            if (checker.test(animal))
//                System.out.print(animal + " ");
//        }
//        System.out.println();
//    }


}
