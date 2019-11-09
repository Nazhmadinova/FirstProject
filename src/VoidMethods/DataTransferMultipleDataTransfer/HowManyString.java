package VoidMethods.DataTransferMultipleDataTransfer;

public class HowManyString {
    //Create a void method name countWords that will accept a String as an argument. Print the following:
    //“The number of words in the sentence is: numberOfWords”
    public static void main(String[] args) {
        countWords("Java is fun");

    }
    public static void countWords(String sentence){
        String[] sep=sentence.trim().split(" ");
        int numberOfWords= sep.length;
        System.out.println("The number of words in the sentence is: "+numberOfWords);
    }
}
