package WrapperClass;

import Constructor.Item;

import java.util.ArrayList;
import java.util.Random;

public class MagicNumber {
    //Create a class MagicNumber
    //Instance variable list of integers.
    //create a method generateNumbers. This method should accept integer for size and it needs
    // to generate given size random numbers and store in list of integers.


    ArrayList<Integer> numbers=new ArrayList();

    public void generateNumbers(int size){
        Random random = new Random();
        for(int i=0;i<size;i++){
            Integer number = random.nextInt(1000);
            numbers.add(number);
            // numbers.add(random.nextInt(1000)); autoboxing
        }
        System.out.println(numbers);
    }

    public  void generateEvens(int size){
        Random random = new Random();
        for(int i=0;i<size;i++){
           int number=1;
           while (number%2!=0){
              number = random.nextInt(100);
           }
           numbers.add(number);
        }
        //Other way
        // public void generateEvens(int size){
        //        Random random = new Random();
        //        numbers.clear();
        //        while(true){
        //            int i = random.nextInt(100);
        //            if(i % 2 == 0){
        //                numbers.add(i);
        //            }
        //
        //            if(numbers.size() == size){
        //                break;
        //            }
        //        }
        System.out.println(numbers);
    }
}
