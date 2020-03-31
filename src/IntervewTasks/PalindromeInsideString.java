package IntervewTasks;

public class PalindromeInsideString {

    //input: myracecar
    //output: racecar

    public static void main(String[] args) {
        System.out.println(getPalindrome("myracecar"));
    }

    public static String getPalindrome(String str){
        if(str.length() == 1 || isPalindrome(str)) return str;

        String string = str;
        for(int i = 0; i < string.length(); i++){
            String sub = string.substring(0, str.length()-1);
            if(isPalindrome(sub)) return sub;
            string = sub;
        }
        return getPalindrome(str.substring(1));
    }

    public static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }
}
