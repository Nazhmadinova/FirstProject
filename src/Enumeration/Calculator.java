package Enumeration;

public class Calculator {

    //Make a better calculator method. Create an enum for all the operators (+,-,*,/,%)
    //Then create a method that will accept two double numbers and an Operator.
    //Return the result of the operation
    //-> Special case: Before you divide, make sure the second number is not 0,
    // if it is 0 then print “ you cannot divide by 0 and return 0. If the second
    // number is not 0 then do the operation as usual.

    public static void main(String[] args) {
        System.out.println(result(2,3,Operators.PLUS));
    }

    public static double result(double a, double b, Operators operators){
        double result = 0;
        switch (operators){
            case PLUS:
                result = a + b;
                break;
            case MINUS:
                result = a - b;
                break;
            case MULTIPLY:
                result = a * b;
                break;
            case MODULE:
                result = a % b;
            case DIVIDE:
                if(b == 0){
                    System.out.println("You cannot divide by 0");
                }else{
                    result = a / b;
                }
        }
        return result;
    }

    //other way
    //public static double calculator(Operators op, double num, double num2) {
    //        switch (op) {
    //            case ADD:
    //               return num + num2;
    //            case MINUS:
    //                return num - num2;
    //            case MULTI:
    //                return num * num2;
    //            case DIV:
    //                if(num2 == 0) {
    //                    System.out.println("You cannot divide by 0");
    //                    return 0;
    //                }
    //                return  num / num2;
    //
    //            case REM:
    //                if(num == 0 || num2 == 0) {
    //                    System.out.println("Invalid remainder operation");
    //                    return 0;
    //                }
    //                return  num % num2;
    //        }
    //        return 0;
    //    }
}
