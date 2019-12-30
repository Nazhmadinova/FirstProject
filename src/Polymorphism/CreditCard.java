package Polymorphism;

public class CreditCard extends PaymentMethod {

    @Override
    public void charge(double amount) {
        System.out.println("amount charged in credit card: " +amount+"\nFee applied: $13");
    }

    @Override
    public void refund(double amount) {
        System.out.println("amount refunded in credit card: " +amount);
    }
}
