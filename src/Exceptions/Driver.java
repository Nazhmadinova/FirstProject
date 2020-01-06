package Exceptions;

public class Driver {

    //Create a class Driver.
    //Add instance variables: name, age, location
    //Encapsulate them and provide public getters and setters.
    //Throw an Exception type in setName method if entered name is consist of 2 or more words.

    private String name;
    private int age;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) throws RuntimeException{
        if(name.trim().contains(" ")){
            throw new RuntimeException();
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception{
        if(age < 0 || age > 120){
            throw new Exception();
        }
        this.age = age;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) throws InvalidLocationException{

        for(int i = 0; i < location.length(); i++){
            if(Character.isDigit(location.charAt(i))){
                throw new InvalidLocationException(location + " Invalid location");
            }
        }
        this.location = location;
    }
}
