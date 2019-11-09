package IfElseStatements;

public class Incrementing {
    public static void main(String[] args) {
        int i = 0;
        int j =0;
        if (i++ == ++j) {
            System.out.println("True: i="+i+", j="+j);
        }
        else {
            System.out.println("False: i="+i+", j=" +j);
        }
    }
}
