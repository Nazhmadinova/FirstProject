package Methods;

import java.util.Scanner;

public class Login {
    public static void login(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account name:");
        String id = input.nextLine();
        System.out.println("Enter password:");
        String password = input.nextLine();

        if(id.equalsIgnoreCase("JohnJava") && password.equals("123456")){
            System.out.println("Login Successful");
        }else{
            System.out.println("Either your password or accountId is not correct!");
        }
    }

    public static void main(String[] args) {
        login();
    }
}
