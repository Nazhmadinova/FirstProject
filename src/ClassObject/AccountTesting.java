package ClassObject;

public class AccountTesting {
    public static void main(String[] args) {
        AccountObj myBank =new AccountObj();
        myBank.name="Gulzhaina Nazhmadinova";
        myBank.type="Checking";
        myBank.accountNumber=134523452123l;
        myBank.balance=1000;

        myBank.deposit(100);
        myBank.transfer(200);
        myBank.info();


    }
}
