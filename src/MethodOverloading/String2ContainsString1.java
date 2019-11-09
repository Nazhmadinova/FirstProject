package MethodOverloading;

public class String2ContainsString1 {
    //Create a method that will accept two Strings. Return true if the first string begins with the second String.
    // Return false if it does not.

    //Overload the method to accept a two Strings and a number.
    // Return true if the second String is found inside of your first
    // String the amount of times equal to your number parameter.
    //input: “jamesjajl”,”ja", 2
    //output: true

    public static boolean check(String first,String second){
        if(first.toLowerCase().startsWith(second.toLowerCase())){
            return true;
        }
        return false;
    }

    public static boolean check(String first,String second, int num){
        int count =0;
        for(int i=0; i<first.length()-second.length()+1;i++){
            if(second.toLowerCase().equals(first.toLowerCase().substring(i,i+second.length()))){
                count++;
            }
        }
        if(count==num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(check("Gulzhaina","Gul"));
        System.out.println(check("jamesjamjam","jam",3));
    }
}
