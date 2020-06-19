package Projects.Project1;

import java.util.Scanner;

public class SumOfLengthCapitalize {
    public static void main(String[] args) {
        //Given two strings of lowercase English letters, word1  and word2, perform the following operations:
        //Sum the lengths of word1 and word2 and print
        //Capitalize the first letter in word1 and word2 and print them on a single line, separated by a space.
        //
        //Sample Input:
        //hello world
        //
        //Sample Output:
        //10
        //Hello World
        //
        //
        //Sample Input:
        //java cool
        //
        //Sample Output:
        //8
        //Java Cool
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words:");
        String str3 = input.nextLine();

        int sum =str3.length();
        System.out.println(sum-1);

        str3 =str3.toLowerCase();
        int space =str3.indexOf(" ");
        System.out.println(str3.substring(0,1).toUpperCase()+str3.substring(1,space) +
                " "+ str3.substring(space+1,space+2).toUpperCase()+str3.substring(space+2));

    }
}
