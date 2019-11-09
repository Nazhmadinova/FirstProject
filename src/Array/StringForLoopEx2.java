package Array;

import java.util.Arrays;

public class StringForLoopEx2 {
    public static void main(String[] args) {
        String [] names=new String[3];
        System.out.println(Arrays.toString(names));
        names[0]="jamie";
        names[1]="bob";
        names[2]="nemo";

        for(int i =0; i< names.length;i++){
            System.out.println("name "+(i+1)+" is " +names[i]);
        }
    }
}
