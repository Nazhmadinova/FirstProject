package IntervewTasks;

public class CountLetters {
    public static void main(String[] args) {
        String str  = "aaatttnnnppphhhyya";
        while (str.length()!= 0) {
            int counter = 0;
            char letter = str.charAt(0);
            for (int i = 0; i < str.length(); i++) {
                if (letter == str.charAt(i)){
                    counter++;
                }
            }
            System.out.println(letter+" = "+counter);
            str = str.replaceAll(letter+"","");

        }
    }
}
