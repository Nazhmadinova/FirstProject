package CodingBat.String3;

public class WithoutString2 {
    public String withoutString(String base, String remove) {
        String n="";
        int i = 0;

        while(i <= base.length() - remove.length()) {
            if(base.substring(i, i + remove.length()).toLowerCase().equals(
                    remove.toLowerCase())) {
                i += remove.length();
            } else {
                n += base.charAt(i);
                i++;
            }
        }

        while(i < base.length()) {
            n+=base.charAt(i);
            i++;
        }

        return n;
    }
}
