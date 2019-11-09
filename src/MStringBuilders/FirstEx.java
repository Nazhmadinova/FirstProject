package MStringBuilders;

public class FirstEx {
    public static void main(String[] args) {
        char[] c=new char[1000000];
        c[0]='a';
        String s= new String(c);
        long start =System.currentTimeMillis();
        //   System.out.println(isPalindrome(s));
        //System.out.println(isPalindromeBetterOne(s));
        System.out.println(isPalindromeStringBuilder(s));
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
    static boolean isPalindrome(String s){
        String reversed="";
        for(int i =s.length()-1;i>=0;i--)
            reversed+=s.charAt(i);
        return s.equals(reversed);
    }

    static boolean isPalindromeBetterOne(String s){
        boolean isPalindrome=true;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                isPalindrome= false;
                break;
            }
        }
        return isPalindrome;
    }

    static boolean isPalindromeStringBuilder(String s){
        StringBuilder sB=new StringBuilder(s);
        String reversed=sB.reverse().toString();
        return s.equals(reversed);
    }
}
