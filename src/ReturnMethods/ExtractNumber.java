package ReturnMethods;

public class ExtractNumber {
    //input: About 293,329,202 results (0.78 seconds)
    //
    // Write a method that extracts the result number and returns it as only numbers
    //output: 293329202
    //Write a method that takes the extracts the result time and returns it as a number and the seconds
    // output: 0.79

    public static String number(String sentence){
      int ind1 =sentence.indexOf(" ")+1;
      int ind2=sentence.indexOf("results")-1;
      String number= sentence.substring(ind1,ind2);
      number=number.replace(",","");
      return number;
    }

    public static void main(String[] args) {
        System.out.println(number("About 293,329,202 results (0.78 seconds)"));
        System.out.println(second("About 293,329,202 results (0.78 seconds)"));
    }

    public static String second(String sentence){
        int ind2=sentence.lastIndexOf(" ");
        int ind1=sentence.indexOf("(")+1;
        return sentence.substring(ind1,ind2);
    }

}
