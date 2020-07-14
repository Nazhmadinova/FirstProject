package IntervewTasks;

public class TwoNumberCounterEqual {

    public static int prefix(int x, int y, int ... a){

        int result = -1;
        int countX = 0;
        int countY = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] == x) countX++;
            else if(a[i] == y) countY++;
            if(countX == countY) result = i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(prefix(6,7,9,7,6,9,7));
    }

}
