package IntervewTasks;

public class CreatePalindrome {

    public static String createPalindrome(String str){

        if(str.equals(null)) return null;
        if(str.isEmpty()) return "";

        String part1 = "";
        String part2 = "";
        String unique = "";

        while (str.length()!= 0) {
            int counter = 0;
            char letter = str.charAt(0);
            for (int i = 0; i < str.length(); i++) {
                if (letter == str.charAt(i)){
                    counter++;
                }
            }

            if(counter > 1){

                for(int i = 0; i < counter/2; i++){
                    part1 += letter;
                    part2 += letter;
                }

                if(counter % 2 == 1){
                    unique += letter;
                }

            }else{
               unique += letter;
            }

            str = str.replaceAll(letter+"","");

        }

        String revPart2 = "";

        for(int i = part2.length()-1; i >=0; i--){
            revPart2 += part2.charAt(i);
        }

        if(unique.length() >= 1){
            return part1 + unique.charAt(0) + revPart2;
        }

        return part1 + revPart2;
    }

    public static void main(String[] args) {

        System.out.println(createPalindrome(null));

    }
}
