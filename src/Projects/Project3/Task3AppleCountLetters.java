package Projects.Project3;

import java.util.Scanner;

public class Task3AppleCountLetters {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter word:");
        String str = input.next().toLowerCase();
        String checked ="";
        String fin="";
        for(int i=0;i<str.length();i++){
            int count=0;

            if(!checked.contains(str.charAt(i)+"")) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                checked += str.charAt(i) + "";
                fin+=str.charAt(i)+":"+count+" ";

            }
        }
        fin=fin.trim();
        System.out.println(fin);
    }
}
