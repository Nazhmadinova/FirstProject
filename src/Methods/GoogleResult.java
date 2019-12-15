package Methods;

public class GoogleResult {
    public static String resultCount(String str){
        int index = str.indexOf(" ");
        int index2 = str.lastIndexOf("r")-1;
        String newStr = str.substring(index,index2);
        newStr = newStr.replace(",","");
        return newStr;
    }

   //public static String resultCount(String str){
    //        //1- split the string with white space " " and store inside of a new array of Strings
    //        String [] arrStr = str.split(" ");
    //        //2- get the second word inside of the array (index #1)
    //        String secondWord = arrStr[1];
    //        //3- remove the commas from the string
    //        String removedCommas = secondWord.replace(",", "");
    //        //4- return value
    //        return  removedCommas;
    //    }

    public static String result(String str){
        int index = str.indexOf("(");
        int index2 = str.lastIndexOf(")");
        String newStr = str.substring(index+1,index2);
        return newStr;
    }

    //public static String resultCount(String str){
    //        String [] words = str.split("\\(");
    //        String seconds = words[1];
    //        return seconds.replaceAll("\\)","");
    //    }

    public static void main(String[] args) {
        System.out.println(resultCount("About 95,000,000 results(1,03 seconds)"));
        System.out.println(result("About 95,000,000 results(1,03 seconds)"));
    }
}
