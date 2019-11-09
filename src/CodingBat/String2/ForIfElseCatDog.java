package CodingBat.String2;

public class ForIfElseCatDog {
    //Return true if the string "cat" and "dog" appear the same number of times in the given string.
    public boolean catDog(String str) {
        int con=0;
        for(int i = 0; i<str.length()-2; i++)
        {
            if(str.charAt(i) == 'c' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 't'){
                con++;
            }
            else if(str.charAt(i) == 'd' &&str.charAt(i+1) == 'o' && str.charAt(i+2) == 'g'){
                con--;
            }
        }
        return (con == 0);
    }
}
