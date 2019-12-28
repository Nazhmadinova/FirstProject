package MethodOverriding;

public class CheckingAccount extends BankAccount {
    //Create a class CheckingAccount.   
    // Extend this class to BankAccount.  
    //  override the method transfer.
    // Checking account’s transfer should be only 5% fee for transferring.
    // Special case: Check if balance is enough.
    // If not enough give proper message and don’t transfer. 

    @Override
    public void transfer(double amount){
        if(amount+amount*0.05<=this.balance){
            this.balance = this.balance-amount-amount*0.05;
        }else{
            System.out.println("You don't have enough balance");
        }

    }
}
