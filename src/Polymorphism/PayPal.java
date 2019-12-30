package Polymorphism;

public class PayPal extends PaymentMethod {

    @Override
    public void charge(double amount) {
        System.out.println("Amount charged in paypal: " + amount+"\nFee applied: $3");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Amount refunded in paypal: " + amount);
    }
}
