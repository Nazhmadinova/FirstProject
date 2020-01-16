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

    public static String countLetters(String word) {
        String unique = "";
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            if(!unique.contains(word.charAt(i)+"")){
                for(int j = 0; j < word.length(); j++){
                    if(word.charAt(i) == word.charAt(j)){
                        count++;
                    }
                }
                unique += word.charAt(i);
                result += word.charAt(i)+" "+count+", ";
            }
        }
        return result.substring(0,result.length()-2);
    }
}

