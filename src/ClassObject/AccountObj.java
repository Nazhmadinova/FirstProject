package ClassObject;

public class AccountObj {
    //Create a class BankAccount
    //Instance variables: type, accountNumber, balance,

    //holderName Methods:
    //deposit. Method accepts double and it doesn’t return anything.
    // Method should simply print “%double is deposited to your account” and add given double to the balance.

    //transfer -> accepts double -> Method should print “%double $ is transferred from your account”
    //and decrement balance by given amount.

    //info -> Method doesn’t accept or return anything. It should simply print the information about
    // the BankAccount as below format
    //Name: %holderName
    //Balace: %balance
    //Type: %type
    //Account Number: %accountNumber

    String name;
    String type;
    long accountNumber;
    double balance;

    public void deposit(double amount){
        System.out.println(amount+"$ is deposited to your account");
        balance+=amount;
    }


    public void transfer(double amount){
        if(amount<=balance) {
            System.out.println(amount + "$ is transferred from your account");
            balance -= amount;
        }else{
            System.out.println("you do not have enough balance");
        }

    }

    public void info(){
        System.out.println("Name: " +name);
        System.out.println("Balance: " +balance);
        System.out.println("Type: " +type);
        System.out.println("Account Number: " +accountNumber);

    }
}
