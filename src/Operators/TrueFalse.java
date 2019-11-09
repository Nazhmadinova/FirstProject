package Operators;

public class TrueFalse {
    public static void main(String[] args) {
        System.out.println(false || true);

        System.out.println(5>4 && 6>4);
        System.out.println(4<3 || false);

        boolean b = 5>1;
        boolean d = false;
        boolean check = d || b || false;
        boolean check2 = d && b;
        System.out.println(b);
        System.out.println(check);
        System.out.println(check2);

        int age =5;
        int age2 = 6;
        boolean ageB = age == age2;
        boolean ageBB = age != age2;
        System.out.println(ageB);
        System.out.println(ageBB);
        System.out.println(!ageB);

        String word ="house";
        String word2 = "house";
        System.out.println(word.equals(word2));

        int a = 10;
        int c = 8;
        System.out.println(true || a++ >c );
        System.out.println(a); // a=10 cause sign || is short hand, so on left side of this sign already true after
        //  that it is not gonna run right side, so a is still equals to 10; if we put on left side false or sign |
        //  then a=11;

        int aa =10;
        int cc = 11;
        System.out.println(true & aa++ > cc);
        System.out.println(aa);
        System.out.println(false & ++aa >cc);
        System.out.println(aa);

        int s = 10;
        int ss= 10* s++;
        System.out.println(s+", "+ss);
        System.out.println(s);




    }
}
