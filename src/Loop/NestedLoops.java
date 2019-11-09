package Loop;

public class NestedLoops {
    public static void main(String[] args) {
        /*
        * 1
        * 12
        * 123
        * 1234
        * 12345
        * 12345
        * 1234
        * 123
        * 12
        * 1
        *
        *
         */

        int outerLoop=0, innerLoop=0;

        for(outerLoop=0; outerLoop<=5; outerLoop++){
            for(innerLoop=1; innerLoop<=outerLoop; innerLoop++){
                System.out.print(innerLoop);
            }

            System.out.println();
        }

        for(outerLoop=5;outerLoop>=0;outerLoop--){
            for(innerLoop=1;innerLoop<=outerLoop;innerLoop++){
                System.out.print(innerLoop);
            }
            System.out.println();
        }

    }
}
