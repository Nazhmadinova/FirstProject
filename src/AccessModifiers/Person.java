package AccessModifiers;

import java.util.Scanner;

public class Person {

    private String name;
    private String gender;
    private int age;
    private double height;
    private double weight;

    //Create a class Person. 
    //create instance variables for Person as below:  name, gender, age, height, weight 

    //2. Encapsulate all instance variables. 

    //Modify setter methods for gender, age, height and weight. 

    //Set age only with valid age. Valid age must be between 0 to 120. If invalid age print “invalid age” and don’t set. 

    //Set gender with valid gender. It must be either male or female. Otherwise give proper
    // message and don’t set the invalid gender.   Both hight and weight should be positive values.
    // Otherwise give proper message. 


    public void setGender(String gender){
        if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")){
            this.gender = gender;
        }else{
            System.out.println("Invalid gender");
        }

    }
    public String getGender(){
        return this.gender;
    }


    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }


    }
    public int getAge(){
        return this.age;
    }

    public void setHeight(double height){
        if(height > 0){
            this.height = height;
        }else{
            System.out.println("Invalid height");
        }

    }
    public double getHeight(){
        return this.height;
    }


    public void setWeight(double weight){
        if(weight > 0){
            this.weight = weight;
        }else{
            System.out.println("Invalid weight");
        }

    }
    public double getWeight(){
        return this.weight;
    }



    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
