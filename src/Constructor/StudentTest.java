package Constructor;

public class StudentTest {

    public static void main(String[] args) {
        Student student1=new Student("James");
        BookObj book=new BookObj("java","Cybertek",20);
        student1.read();
        student1.read(book);
        student1.read(2);
    }
}
