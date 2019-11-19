package Replit.ReturnMethod;

public class Getduplicates {
    //getDup accepts an array and returns an int.
    //
    //If there is any element is duplicated, method counts how many of those present in the array.

    //getDup(["1","2","aa"',"1"])
    //returns:2 ("1" is duplicated and there are two "1"s so return is 2)
    //
    //getDup(["1","2","aa"',"1", "aa"])
    //returns:4 ("1" is duplicated and there are two "1"s
    //           and 2 "aa"s so return is 4)

    //getDup(["1","g","aabb',"7","7","2","aa"',"7"])
    //returns:3

    public static int getDup(String[] r)
    {

        String unique="";

        for(int i=0;i<r.length;i++){
            if(!unique.contains(r[i])){
                unique+=r[i]+" ";
            }
        }
        unique=unique.trim();
        String [] newR=unique.split(" ");
        int totalCount=0;
        for(int i=0;i<newR.length;i++){
            int count=0;
            for(int j=0;j<r.length;j++){
                if(newR[i].equals(r[j])){
                    count++;
                }
            }
            if(count>1){
                totalCount+=count;
            }
        }
        return totalCount;
    }
}
