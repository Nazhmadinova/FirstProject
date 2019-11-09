package ReturnMethods;

public class MultipleReturns {
    public static int stringLength(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            count++;
        }
        return count;
    }

    public static int checkNumber(int num){
        if(num <0){
            return 0;
        }
        else{
            return num;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(-4));
        System.out.println(checkNumber(4));
        System.out.println(stringLength("word"));
    }
}
