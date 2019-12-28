package WrapperClass;

public class Test {
   public static void main(String[] args) {
        String str = "I love Picnic";
        String s = "";
        for(int i = 0; i < str.length(); i++){
            if(i+6 <= str.length() && str.substring(i,i+6).equalsIgnoreCase("picnic")){
                i+=6;
            }else{
                s+=str.charAt(i);
            }
        }

        System.out.println(s);
    }
}
