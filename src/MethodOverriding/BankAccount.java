package MethodOverriding;

public class BankAccount {
    //Create a class BankAccount  Public instance variables: balance, accountNumber, name  
    // methods:  info: This method shows the details of the BankAcount.
    // Print balance, account number and name in this method implementation.  
    // transfer: This method accepts double and doesn’t return anything.
    // Method should subtract the amount given and 10% of given amount as a transfer fee.   
    // deposit: Method accept double and adds this amount to the balance.

    public double balance;
    public long accountNumber;
    public String name;

    public void info(){
        System.out.println("Balance: "+this.balance);
        System.out.println("Account number: "+ this.accountNumber);
        System.out.println("Name: " + this.name);
    }

    @Override
    public String toString(){
        String str = "Balance: "+this.balance+ "\nAccount number: "+ this.accountNumber+"\nName: "+this.name;
        return str;
    }

    public void transfer(double amount){
        this.balance = this.balance-amount-amount*0.1;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }
}
