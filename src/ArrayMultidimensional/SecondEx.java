package ArrayMultidimensional;

import java.util.Arrays;

public class SecondEx {
    public static void main(String[] args) {
        int [][] groups= new int[3][4];
        int [] num ={1,2,3,4,5};
        groups[0]=num;
        System.out.println(Arrays.deepToString(groups));

        String [][]str=new String [4][4];
        System.out.println(Arrays.deepToString(str));

        int [][] numbers ={{1,2,3,9},{4,5},{7,8,9}};
        System.out.println(Arrays.toString(numbers[0]));
        System.out.println(numbers[0][0]);
        System.out.println(Arrays.toString(numbers[0])+" "+Arrays.toString(numbers[2]));
        System.out.println(numbers.length);
        System.out.println(numbers[1].length);

        for(int i=0;i<numbers.length;i++){
            for (int j =0; j<numbers[i].length;j++){
                System.out.println(numbers[i][j]);
            }
            System.out.println();
        }

        for(int [] arr: numbers){
            for(int number: arr){
                System.out.println(number);
            }
            System.out.println();
        }
    }
}
