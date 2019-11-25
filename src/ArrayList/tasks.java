package ArrayList;

import java.util.ArrayList;

public class tasks {
    // reorders the array so that all the even numbers come first and the odds come second.
    // Within those two groupings, the order doesn't matter. You can treat zero as even.
    public static void OddsEvens (ArrayList<Integer> theList) {
        ArrayList<Integer> finished = new ArrayList<Integer>();
        for(int i = 0; i < theList.size(); i++){
            if(theList.get(i)%2 == 0)
                finished.add(i);
        }
        for(int i = 0; i < theList.size(); i++){
            if(theList.get(i)%2 != 0)
                finished.add(i);
        }
        theList = finished;
    }

    // removes every odd element in the array
    public static void removeOdds (ArrayList<Integer> theList) {
        int length = theList.size() - 1;
        //ArrayList<Integer> removed = new ArrayList<Integer>();
        for(int i = 0; i < length; i++)
            if(theList.get(i)%2 == 1){
                length--;
                theList.remove(i);
                i--;
            }

    }
}
