package IntervewTasks;

public class CreatePalindrome {

    public static String createPalindrome(String str){

        if(str.equals(null)) return null;
        if(str.isEmpty()) return "";

        String part1 = "";
       StringBuilder part2 = new StringBuilder();
        String unique = "";

        while (str.length()!= 0) {
            char letter = str.charAt(0);
            int counter = str.length() - str.replace(letter+"","").length();

            if(counter > 1){
                for(int i = 0; i < counter/2; i++){
                    part1 += letter;
                    part2.insert(0,letter);
                }
                if(counter % 2 == 1){
                    unique += letter;
                }
            }else{
               unique += letter;
            }
            str = str.replaceAll(letter+"","");
        }

        if(unique.length() >= 1){
            return part1 + unique.charAt(0) + part2.toString();
        }
        return part1 + part2.toString();
    }

    public static void main(String[] args) {
        System.out.println(createPalindrome("asas"));
    }
}
