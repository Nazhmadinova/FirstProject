package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Cars {

    public static void main(String[] args) {
        String [] carBrands = {"mercedes", "bmw","toyota","ferrari"};
        for(String car: carBrands){
            if(car.equalsIgnoreCase("mercedes")){
                System.out.println(car+": Luxury-Comfort");
            }else if(car.equalsIgnoreCase("bmw")){
                System.out.println(car+": Luxury-Sport");
            }else if(car.equalsIgnoreCase("toyota")){
                System.out.println(car+": Reliable - Cheap");
            }else if(car.equalsIgnoreCase("ferrari")){
                System.out.println(car+": Super car-Super expensive");
            }

        }

        String [] shows = {"Game of Thrones","Friends","Prison Break","Doctor Who","Greys Anatomy"};
        Arrays.sort(shows);
        System.out.println("Sorted list of shows:");

        for(int i = 0; i < shows.length; i++){
            System.out.println("#"+i+" "+shows[i]);
        }

        int [] grades = {15,25,33,35,66,44,78,95,98,1,500};
        int min = grades[0];
        int max = grades[0];

        for(int i =0; i < grades.length; i++){
            if(min > grades[i]){
                min = grades[i];
            }else if(max < grades[i]){
                max = grades[i];
            }
        }
        System.out.println("Min grade: "+min);
        System.out.println("Max grade: "+max);

        Arrays.sort(grades);
        System.out.println("Min grade: "+grades[0]);
        System.out.println("Max grade: "+grades[grades.length-1]);

        String [] groceryList = {"apple","carrot","orange","cherry","strawberry"};
        Arrays.sort(groceryList);
        System.out.println(Arrays.toString(groceryList));
        System.out.println("Index of apple "+Arrays.binarySearch(groceryList,"apple"));
        System.out.println("Index of orange "+Arrays.binarySearch(groceryList,"orange"));

    }
}
