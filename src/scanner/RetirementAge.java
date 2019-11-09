package scanner;


import java.util.Scanner;

public class RetirementAge {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
  //      System.out.println("What is the wall color?");
  //      String color = input.nextLine();
  //      System.out.println("what is the length?");
  //      int length = input.nextInt();
  //      System.out.println("Is it good one?");
  //      String answer = input.nextLine();
  //      System.out.println("Color: " +color);
   //     System.out.println("Length:  " + length);
   //     System.out.println("Good?: " + answer);



//        Create a number variable for age. Create another variable that has a value of: (65- the given age). Then print
//        the resulting age in this format: Because you are: givenAge years old and will retire in: secondAge years
//        > input: 23
//        > output: Because you are: 23 years old and will retire in: 42 years

        System.out.println("Enter your age: ");
        int age = input.nextInt();
        int retirementAge = 65;
        int result = retirementAge - age;

        System.out.println("Because you are: " + age + " years old and will retire in: " + result);





    }

}
