package Polymorphism;

public class MoneyGram implements MobileVerifiable {

    @Override
    public boolean verify() {
        System.out.println("MoneyGram is cancelling");
        return false;
    }
}
