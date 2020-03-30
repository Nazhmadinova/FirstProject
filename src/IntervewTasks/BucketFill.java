package IntervewTasks;

import java.util.ArrayList;

public class BucketFill {

    /*Digital graphics tools often make available a "bucket fill" tool that will only paint adjacent cells.
    In one fill, a modified bucket tool recolors adjacent cells (connected horizontally or vertically but
    not diagonally) that have the same color. Given a picture represented as a 2-dimensional array of letters
    representing colors, find the minimum number of fills to completely repaint the picture.
     */


    //input:
    //                      {{b, b, b, b, a},
    //                      {a, b, b, a, a},
    //                      {a, c, c, a, a},
    //                      {a, a, a, a, c}};

    //output: b=1, a=1, c=2, total = 4;



    public static int numberOfColorFills(int x, int y, String[][] arr) {

        int count = 0;

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){

            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[][] arr = {{"b", "b", "b", "b", "a"},
                          {"a", "b", "b", "a", "a"},
                          {"a", "c", "c", "a", "a"},
                          {"a", "a", "a", "a", "c"}};

        System.out.println(numberOfColorFills(arr.length,5,arr));
    }

}
