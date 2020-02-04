package CollectionFramework;

import java.util.*;

public class OddNumbersSet {
    public static void main(String[] args) {
        //Create a Set of numbers and ask the user to enter to enter 5 numbers.
        //    - Go through each number and remove any numbers that are odd
        //    - Print your Changed Set

        Set<Integer> numbers = new HashSet<>();
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i = 0; i < num; i++){

            numbers.add(input.nextInt());

        }

        Iterator<Integer> nums = numbers.iterator();

        while (nums.hasNext()){
            if(nums.next()%2 != 0){
                nums.remove();
            }
        }

        System.out.println(numbers);
    }
}
