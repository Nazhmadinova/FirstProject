package CodingBat.String3;

public class gHappy {
    public boolean gHappy(String str) {
        if (str.equals("g")) return false;
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.substring(i, i + 1).equals("g") && !str.substring(i + 1, i + 2).equals("g")) return false;
            if (i > 0 && i< str.length()-1) {
                if (str.substring(i, i + 1).equals("g") && !str.substring(i - 1, i).equals("g") && !str.substring(i + 1, i + 2).equals("g")) return false;
            }
            if (i == str.length()-1 && str.substring(i).equals("g") && !str.substring(i - 1, i).equals("g")) return false;
        }
        return true;
    }
}
