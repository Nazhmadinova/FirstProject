package Methods;

public class Loremlpsum {
    public static boolean doesContain(String str){
       String [] arr = str.split("\\.");
       if(arr.length >=3){
           if(!arr[2].contains("massa")){
               return false;
           }
       }
       return true;
    }

    public static void main(String[] args) {
        System.out.println(doesContain("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Risus in hendrerit gravida rutrum. Cursus turpis massa tincidunt dui ut. Quisque non tellus orci ac. In nisl nisi scelerisque eu ultrices vitae auctor eu augue."));
    }
}
