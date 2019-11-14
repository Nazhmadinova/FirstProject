package ArrayMultidimensional;

public class BiggestSumOfElem {
    //Create a method that takes a 2D array and return the index of the inner array which has the biggest sum of its elements
    public static void main(String[] args) {
        int [][] arr={{3,5,2,342,4,23},{43,32,4032,32,43},{43,43,23,23}};
        System.out.println(indexx(arr));
    }

    public static int indexx(int[][]arr){
        int num=0;
        int ind=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            if(num<sum){
                num=sum;
                ind=i;
            }
        }
        return ind;

    }
}
