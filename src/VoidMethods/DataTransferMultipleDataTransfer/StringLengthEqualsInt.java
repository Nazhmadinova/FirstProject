package VoidMethods.DataTransferMultipleDataTransfer;

public class StringLengthEqualsInt {
    //Create a method that accepts String and int.
    //Check if string length is same as given integer.
    //Print "Equal" if they are equal. Print "Not equal" if string length and given integer are not equal.
    public static void main(String[] args) {
        check("Gulzhaina",7);
    }

    public static void check(String word, int num){
        if(word.length()==num){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
