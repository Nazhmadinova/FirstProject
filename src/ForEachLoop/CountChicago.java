package ForEachLoop;

public class CountChicago {
    public static void main(String[] args) {
        //Print the number of times Chicago was found in the cities
        String[] cities ={"Chicago", "New York", "Madison", "Miami","Chicago", "Washington"};
        int count=0;
        for(String city: cities){
            if(city.equals("Chicago")){
                count++;
            }
        }System.out.println("Chicago"+count);
    }
}
