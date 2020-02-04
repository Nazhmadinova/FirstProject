package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SchoolTestingStudentMap {

    public static void main(String[] args) {

        //2) Ask the user how many students they want to add to the school
        //3) Allow the user to enter each students information one at a time and add them to a Map
        // with unique ID values starting from 15
        //4) Loop through and print all the student names and their ID values
        //        Ex: ID: 15 / Name: "James"
        //        Ex: ID: 16 / Name: "Adam"

        Map<Integer, Student > students = new HashMap<>();
        System.out.println("How many students?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        int id = 15;
        for(int i = 0; i < num; i++){
            System.out.println("Enter student name:");
            String name = scanner.nextLine();
            System.out.println("Enter student hobby:");
            String hobby = scanner.nextLine();
            System.out.println("Enter student age:");
            int age = scanner.nextInt();
            scanner.nextLine();

            Student student = new Student(name, age, hobby);
            students.put(id++, student);
        }

        for(Integer key: students.keySet()){
            System.out.println("ID: " + key + " / Name: " + students.get(key).name);
        }


    }
}
