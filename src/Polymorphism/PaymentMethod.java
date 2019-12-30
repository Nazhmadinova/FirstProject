package Polymorphism;

public class PaymentMethod extends A implements MobileVerifiable{

    public void charge(double amount){
        System.out.println("Amount charged: " + amount);
    }

    public void refund(double amount){
        System.out.println("Amount charged: " + amount);
    }

    @Override
    public boolean verify(){
        System.out.println("Please approve");
        return true;
    }

}
