package MethodOverriding;

public class BankingTest {
    public static void main(String[] args) {
//        BankAccount ba = new BankAccount();
//        ba.balance = 300;
//        ba.name = "Zhaina";
//        ba.accountNumber = 423442;
//        System.out.println(ba);
        SavingsAccount save = new SavingsAccount();
        save.name = "Zhaina";
        save.balance = 100;
        save.accountNumber = 3425435353455l;
        save.interestIncome = 8;
        System.out.println(save.toString());


    }
}
