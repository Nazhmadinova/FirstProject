package IntervewTasks;

public class RunLengthEncode {

    //counting same closest letters

    public static String encode(String str){

        if(str == null || str.length() == 0){
            return "";
        }

        String result = "";

        char [] characters = str.toCharArray();
        int counter = 0;
        char temp = 0;

        for(char c: characters){
            if(c == temp){
                counter++;
            }else{
                if(temp != 0){
                    result += (counter + "" + temp);
                }
                temp = c;
                counter = 1;
            }
        }
        result += (counter + ""  + temp);

        return result;
    }


    public static void main(String[] args) {
        System.out.println(encode("aaaabhb"));
    }
}
