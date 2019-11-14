package ArrayMultidimensional;

public class HighestSum {
    //Create a method that will sum the values from a 2D array in an hour glass shape. Return the highest sum.

    public static void main(String[] args) {
        int[][] arr={{4,3,2,5},{6,7,1,9},{8,4,2,7},{3,6,9,5}};
        System.out.println(biggestHourGlass(arr));
    }
    public static int biggestHourGlass(int[][] arr){

        int maxSum=0;
       if(arr.length>=3){
           for(int i=0;i<arr.length-2;i++){
               if(arr[i].length>=3){
                   for(int j=0; j<arr[i].length-2;j++){
                       int sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+ arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];

                       if(sum>maxSum){
                           maxSum=sum;
                       }
                   }

               }else {
                   return 0;
               }

           }
       }else {
           return 0;
       }
       return maxSum;
    }


}
