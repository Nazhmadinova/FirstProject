package Polymorphism;

public class Person {

    private String name;

    public Person(String name){
       this.name = name;
    }

    public void info(){
        System.out.println("Name: " + this.name);
    }

    public boolean hasSameName(Person otherPerson){
        return this.name.equalsIgnoreCase(otherPerson.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
