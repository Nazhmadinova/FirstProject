package Constructor;

import ReturnMethods.Calculator;

public class PhoneTesting {
    public static void main(String[] args) {
        // When we give value for constructor it means those data types are not by default;
        Phone inf= new Phone("Iphone","grey",-2,true); // instance variable;
//        inf.phoneNumber=123456789987l; this instance variables we can resign, now those are not by default
//        inf.text="Hi";

        boolean result =inf.text(1234567892L,"Hi"); // behavior
        System.out.println(result);
        inf.call(1234567898l);
    }
}
