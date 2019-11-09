package StringManipulation;

public class CompareTo {
    public static void main(String[] args) {
        String word ="5Java";
        String word2 ="James";
        String word3 ="5Java";
        System.out.println(word.compareTo(word2));
        System.out.println(word2.compareTo(word));
        System.out.println(word.compareTo(word3));
    }
}
