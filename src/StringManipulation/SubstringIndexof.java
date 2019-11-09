package StringManipulation;

public class SubstringIndexof {
    public static void main(String[] args) {
        String word ="Kevin fell from his bike";
        int from = word.indexOf("from");
        String word2 = word.substring(0,from);
        String word3 = word.substring(from);
        System.out.println(word3);
    }
}
