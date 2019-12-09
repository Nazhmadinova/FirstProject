package AccessModifiers;

import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();

        Scanner input = new Scanner(System.in);
        int age = -1;

        while (age < 0){
            System.out.println("Enter age:");
            age = input.nextInt();
        }

        person.setAge(age);
        System.out.println(person.getAge());

    }
}
