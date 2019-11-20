package Constructor;

public class Sky {

    String color;
    int visibleStars;

    public Sky(){
        System.out.println("Hi there");
    }

    public void info(){
        System.out.println("Color " +color);
        System.out.println("Visible Stars "+this.visibleStars);
    }

    public Sky(String colorCode){
        this.color=colorCode;
    }

    //Create a constructor that takes both color and visibleStars and set them accordingly

    public Sky(String color, int visibleStars){
        this.color=color;
        this.visibleStars=visibleStars;
    }



    //exception it  is program:
    public static void main(String[] args) {
        Sky refSky=new Sky(); // Sky() -> it is a constructor;
         refSky=new Sky("Red"); //resigning
        System.out.println(refSky.color);


        Sky s2=new Sky("yellow",7);
        s2.info();

        refSky=s2;
        refSky.info();

    }

}
