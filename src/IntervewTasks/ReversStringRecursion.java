package IntervewTasks;

public class ReversStringRecursion {

    public static void main(String[] args) {
        String str = "Welcome";
        String reversed = reverseString(str);
        System.out.println(reversed);
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    /* elcome W
       lcome  e
       come   l
       ome    c
       me     o
       e      m
       ""     e
     */



}
