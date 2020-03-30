package Basic;

public class Class {

    String str;

    {
        System.out.println("Instance initializer");
    }

    public Class(String str){
        this.str = str;
        System.out.println(str);
    }

    static{
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        Class c = new Class("String");
        System.out.println("Main method end");
    }


}
