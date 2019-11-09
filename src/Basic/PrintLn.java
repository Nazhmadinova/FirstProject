package Basic;

public class PrintLn {

    public static void main(String[] args) {

        int apples;
        apples = 10;
        int oranges =5;

        System.out.println("apples: " +apples);
        System.out.println("oranges: " +oranges);

        apples = 8;
        oranges = apples;

        System.out.println("apples after: " + apples);
        System.out.println("oranges after: " + oranges);

        int wild = 20;
        int pets = 0;
        System.out.println("wild: " + wild);
        System.out.println("pets: " + pets);

       pets = 5;
       wild = wild- pets;

        System.out.println("wild: " + wild);
        System.out.println("pets: " + pets);

       pets = pets +5;
       wild = wild - 5;
        System.out.println("wild: " + wild);
        System.out.println("pets: " + pets);

        int n1 = 6;
        int n2 = 6;
        System.out.println(n1 + n2+"dsdf" +n1 +n2);

        double height = 6.5;
        int intHeight = (int)height;
        double secondDouble = intHeight;
        System.out.println(intHeight);

        String firstName = "Gulzhaina";
        String LastName = "Nazhmadinova";
        String Email = "@cybertek.com";
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + LastName);
        System.out.println("Email: " + Email);

        short chairs = 5;
        long moreChairs = chairs;
        int lessChairs = (int)moreChairs;
        System.out.println(lessChairs);
        double moreChairs1 = chairs;
        System.out.println(moreChairs1);

        int wild1 = 20;
        int pets1 = 0;
        int pets2 = wild1-5;
        System.out.println(pets2);

        int a =10;
        int b = 20;
        int c =30;
        System.out.println((a+b+c)/3);

        double F = 72.5;
        double C = 5 *(F-32)/9;
        System.out.println(C);

        double q =15;
        double w = 23;
        double e = 367;
        double sum = q+w+e;
        double avg = sum/3;
        System.out.println(avg);


        int k, l, h,r;
        k=5;
        l=6;
        h=k+l;
         r=(h-1)/2;
        System.out.println(r);






    }

}
