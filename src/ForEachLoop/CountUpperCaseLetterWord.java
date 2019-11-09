package ForEachLoop;

public class CountUpperCaseLetterWord {
    public static void main(String[] args) {
        //Given a String array with value of:
        //"Bread", "cucumber", "Apples", "Orange", "cookies", “Cake"
        //Print out how many of the words begin with uppercase letters
        String [] words={"Bread", "cucumber", "Apples", "Orange", "cookies","Cake"};
        int count =0;
        for(String word: words){
            if(word.charAt(0)>=65&&word.charAt(0)<=90){
                count++;
                System.out.println(word);
            }
        }
        System.out.println(count+" words begin with uppercase letters");

        //Other way
        //char start = item.charAt(0);
        // if(Character.isUppercase(start));takes character,return to boolean.
    }
}
