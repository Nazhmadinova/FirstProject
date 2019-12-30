package Polymorphism;

public class Student extends Person{

    private int studentNumber;

    public Student(String name, int number){
        super(name);
        this.studentNumber = number;
    }

    @Override
    public void info(){
        super.info();
        System.out.println("Student number: " + this.studentNumber);
    }

    public boolean equals(Student otherStudent){
       return this.hasSameName(otherStudent) &&
               this.studentNumber == otherStudent.studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }



}
