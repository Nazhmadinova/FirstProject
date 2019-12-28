package MethodOverriding;

public class SavingsAccount extends BankAccount{
    //Create a class SavingsAccount. 
    //  Add interestIncome instance variable. 
    // Extend it to BankAccount.   
    // Override the transfer here as well.
    // SavingsAccount transfer should be 20% fee.  
    // Override info method.
    // Change the implementation and print all the info including interestIncome information as well

    public double interestIncome;

    @Override
    public void transfer(double amount){
        this.balance = this.balance-amount-amount*0.2;
    }

    @Override
    public void info(){
        super.info();
        System.out.println("interest income "+this.interestIncome);
    }

    //Create additional method calculateAnnualInterestIncome.
    // 3% of the current balance should go to interestIncome. 

    public void calculateAnnualInterestIncome(){
        this.interestIncome += this.balance*0.03;

    }

    //  Override Object class’s toString method.
    // Build a proper String with all instance variables and return the string. 

    @Override
    public String toString() {

        String str = super.toString()+"\ninterestIncome: "+interestIncome;
        return str;
    }

}
