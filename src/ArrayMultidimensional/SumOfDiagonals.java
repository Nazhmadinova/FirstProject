package ArrayMultidimensional;

public class SumOfDiagonals {
    //Create a method that will take 2d array and return the difference between the sum of the diagonals

    public static void main(String[] args) {
        int[][]arr={{1,2,5},{5,6,7},{9,10,11}};
        System.out.println(diff(arr));
    }
    public static int diff(int[][] arr){
        int difference=0;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==j){
                    sum1+=arr[i][j];
                }
            }
        }


        for(int i=0;i<arr.length;i++){
            sum2+=arr[i][arr[i].length-1-i];
        }
        difference=Math.abs(sum1-sum2);
        return difference;
    }

    //other way
    //public static int differenceOfSum(int [][] arr)  {
    //        int sumOne = 0;
    //        int sumTwo = 0;
    //        for(int i=0 , j = arr.length-1; i < arr.length; i++, j--) {
    //            sumOne += arr[i][i];
    //            sumTwo += arr[j][i]; //arr[arr.length-1-i][i]
    //        }
    //        return Math.abs(sumOne - sumTwo);
    //    }
}
