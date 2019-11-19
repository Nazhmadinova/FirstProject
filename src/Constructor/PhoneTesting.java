package Constructor;

import ReturnMethods.Calculator;

public class PhoneTesting {
    public static void main(String[] args) {
        Phone inf= new Phone("Iphone","grey",-2,true); // instance variable;

        boolean result =inf.text(1234567892L,"Hi"); // behavior
        System.out.println(result);
        inf.call(1234567898l);
    }
}
