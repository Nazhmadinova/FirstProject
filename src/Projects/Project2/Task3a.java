package Projects.Project2;

import java.util.Scanner;

public class Task3a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=0;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        String answer;
        do{
            System.out.println("Enter the number: ");
            num=input.nextInt();
            input.nextLine();

            if(num>0){
                positive++;
            }else if(num<0){
                negative++;
            }else{
                zero++;
            }
            System.out.println("Do you want to continue y/n?");
            answer=input.nextLine();

        }while(answer.equals("y"));

        System.out.println("Positive numbers: "+positive);
        System.out.println("Negative numbers: "+negative);
        System.out.println("Zero numbers: "+zero);
    }
}
