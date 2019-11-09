package Array;

public class Task3LoopColor {
    public static void main(String[] args) {
        //PartI. Create String array for the colors.
        //Initialize 4 colors.
        //Loop through each element using for loop and print each color names.

        //PartII. Print the color names if the length of the color is 4 or more.

        String[]colors=new String[4];
        colors[0]="red";
        colors[1]="blue";
        colors[2]="pink";
        colors[3]="black";

        for(int i=0;i<colors.length;i++){

            if(colors[i].length()>=4){
                System.out.println(colors[i]);
            }
        }





    }
}
