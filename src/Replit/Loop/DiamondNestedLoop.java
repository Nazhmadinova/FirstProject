package Replit.Loop;

public class DiamondNestedLoop {
    public static void main(String[] args) {
        int  i, j, space = 4;
        for (j = 1; j <= 4; j++)
        {
            space--;
            for (i = 1; i <= space; i++)
            {
                System.out.print(" ");
            }

            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        space = 1;
        for (j = 1; j <= 3; j++)
        {
            for (i = 1; i <= space; i++)
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (4 - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
