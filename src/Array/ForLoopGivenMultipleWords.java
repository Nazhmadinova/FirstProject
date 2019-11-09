package Array;

public class ForLoopGivenMultipleWords {
    public static void main(String[] args) {
        //Given a String of: "knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can”, “fridge”, “dish washer”
        //Go through the array and print the value if there is multiple words.
        String[] words={"knife","wooden spoons","plates","cups","forks"," pan","pot","trash can", "fridge", "dish washer"};

        for(int i =0;i<words.length;i++){
            if(words[i].trim().contains(" ")){
                System.out.println(words[i]);
            }
        }
    }
}
