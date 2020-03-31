package IntervewTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BucketFill {

    /*Digital graphics tools often make available a "bucket fill" tool that will only paint adjacent cells.
    In one fill, a modified bucket tool recolors adjacent cells (connected horizontally or vertically but
    not diagonally) that have the same color. Given a picture represented as a 2-dimensional array of letters
    representing colors, find the minimum number of fills to completely repaint the picture.
    ex: picture = ["aabba","aabba", "aaacb"]
     */

    //input:
    //                      {{b, b, b, b, a},
    //                      {a, b, b, a, a},
    //                      {a, c, c, a, a},
    //                      {a, a, a, a, c}};

    //output: b=1, a=1, c=2, total = 4;

    public static int numberOfColorFills(List<String> picture) {
        int count = 0;

        char [][] arr = new char[picture.size()][picture.get(0).length()];
        for(int i = 0; i < picture.size(); i++){
            for(int j = 0; j < picture.get(i).length(); j++){
                arr [i][j] = picture.get(i).charAt(j);
            }
        }


        return count;
    }



    public static void main(String[] args) {
        String[][] arr = {{"a","a","b","b","a"},{"a","a","b","b","a"},{"a","a","a","c","b"}};
        List<String> list = new ArrayList<>();
        list.add("aabba");
        list.add("aabba");
        list.add("aaacb");

        System.out.println(numberOfColorFills(list));





    }

}
