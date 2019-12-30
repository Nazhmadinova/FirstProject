package Polymorphism;

public class TestStudent {

    public static void main(String[] args) {

        HighSchoolStudent student = new HighSchoolStudent("James", 20,10);

        Student student2 = new HighSchoolStudent("James", 19, 10);

        Person student3 = new HighSchoolStudent("James", 19, 10);

        student2.info();

        System.out.println(student.getGradeLevel());
       // System.out.println(student2.getGradeLevel());it is not gonna compile
        System.out.println(((HighSchoolStudent)student2).getGradeLevel());

        Person [] people = new Person[3];
        //Object [] people = new Person[3]; it works too
        people[0] = student;
        people[1] = student2;
        people[2] = student;

        for(Person p: people){
            p.info();
        }
    }

}
