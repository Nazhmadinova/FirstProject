package Polymorphism;

import java.util.ArrayList;

public class VerifyTransactions {

    public static void main(String[] args) {
        MobileVerifiable mv1 = new ZelleTransfer();
        MobileVerifiable mv2 = new MoneyGram();
        MobileVerifiable mv3 = new CreditCard();

        ArrayList<MobileVerifiable> transactions = new ArrayList<>();
        transactions.add(mv1);
        transactions.add(mv2);
        transactions.add(mv3);

        for(MobileVerifiable m: transactions){
            if(m.verify()){
                System.out.println("Success!");
            }else{
                System.out.println("Failed");
            }
        }
    }
}
