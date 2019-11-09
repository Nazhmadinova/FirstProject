package Loop;

public class While {
    public static void main(String[] args){
        int a = 0;
        while (a<10){

            a++;
            if(a==3){
                continue;

            }
            System.out.println(a);
        }
    }
}
