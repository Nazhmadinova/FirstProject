package Operators;

import java.util.Scanner;

public class IncrementDecrement {
    public static void main(String[] args) {
        int age = 5;
        System.out.println(age);
        System.out.println(++age);
        System.out.println(age++);
        System.out.println(age);
        System.out.println(--age);
        System.out.println(age--);
        System.out.println(age);

        int x = 11;
        int y = x++; // int y =11;
        System.out.println("x=" +x);
        System.out.println("y="+y);
        System.out.println(y);

        int book = 10;
        book ++ ;
        book ++;
        System.out.println(book);

        book--;
        --book;
        System.out.println(book);

        int q =10;
        int w = q++;
        System.out.println(q);
        System.out.println(q);
        System.out.println(w);
        System.out.println(w);

        int e = 3;
        int r =e++ *10;
        System.out.println(e);
        System.out.println(r);
        e=e*10;
        System.out.println(e);

        int t= 3;
        int u = t++ *10;
        System.out.println(u);
        System.out.println();


                Scanner scanner = new Scanner(System.in);
                int num = scanner.nextInt();
                int num2 = 1;
                System.out.println("8*1 = " +num*num2);
                num2++;
                System.out.println("8*2 = " +num*num2);
                num2++;
                System.out.println("8*3 = " +num*num2);
                num2++;
                System.out.println("8*4 = " +num*num2);
                num2++;
                System.out.println("8*5 = " +num*num2);
                num2++;
                System.out.println("8*6 = " +num*num2);
                num2++;
                System.out.println("8*7 = " +num*num2);
                num2++;
                System.out.println("8*8 = " +num*num2);
                num2++;
                System.out.println("8*9 = " +num*num2);
                num2++;
                System.out.println("8*10 = " +num*num2);


    }
}
