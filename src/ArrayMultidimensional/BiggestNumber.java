package ArrayMultidimensional;

public class BiggestNumber {
    public static void main(String[] args) {
        //Sample values: {{3,5,2,342,4,23},{43,32,4032,32,43},{43,43,23,23}}
        //——————
        //Create a method that will return the biggest numbers from a 2D array

        int [][] arr={{3,5,2,342,4,23},{43,32,4032,32,43},{43,43,23,23}};
        System.out.println(biggest(arr));
    }

    public static int biggest(int[][] arr){
        int big=arr[0][0];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(big<arr[i][j]){
                    big=arr[i][j];
                }
            }
        }
        return big;
    }
}
