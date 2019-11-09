package Loop;

public class ForIfSeparateLetter {
    public static void main(String[] args) {
        String word ="Cybertek";
        for(int i=0; i<word.length();i++){
            if(word.charAt(i)=='b'){
                String s =word.charAt(i)+"";
                System.out.println(s.toUpperCase()+" " +i);
                continue;
            }
            System.out.println(word.charAt(i)+" "+i);
        }
    }
}
