package ReturnMethods;

import ClassObject.HouseObj;

public class Calculator {
    //Create a calculator method that will take three arguments: an operator ( +, -, *, /, %)  and two numbers.
    // Perform that operation between the two numbers and return the result

    public static double result(int num1,int num2, String oper){
        switch (oper){
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case "*":
                return num1*num2;
            case "/":
                    return num1/num2;
            case "%":
                return num1%num2;
            default:
                System.out.println("Invalid operator");
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(result(4,4,"+"));
    }
}
