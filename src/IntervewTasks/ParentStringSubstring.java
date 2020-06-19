package IntervewTasks;

public class ParentStringSubstring {

    // parent = sunday
    // substring = day
    // returns = 3

    public static int indexOfSubstring(String parent, String substring){

        String str = "";

        for(int i = 0; i < parent.length(); i ++){
            str += parent.charAt(i);
            if(str.length() == substring.length()){
                if(str.equals(substring)){
                    return i - (substring.length() - 1);
                }else{
                    str = "";
                    i -= (substring.length() - 1);
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(indexOfSubstring("sunday", "bay"));
    }

}
