package Exceptions;

public class FinallyEx {
    public static void main(String[] args) {
        String s = "";

        try{
            s = "Cybertek";
            System.out.println(s.substring(10));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Index doesn't exist");
        }finally {
            System.out.println("The string was " + s);
            throw new RuntimeException();
        }



    }
}
