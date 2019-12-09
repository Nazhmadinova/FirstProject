package AccessModifiers.Encapsulation;

public class Chair {
    private int size;
    public String model;

    public void setter(int size){
        if(size > 0){
            this.size = size;
            System.out.println(this.size);
        }else{
            this.size = 0;
            System.out.println(this.size);
        }

    }

    public int getter(){
        if(this.model.equalsIgnoreCase("ikea")){
            return this.size;
        }else{
            System.out.println("Sorry, it is not Ikea chair");
            return 0;
        }

    }

    public void info(){
        System.out.println("Model: " +this.model);
        System.out.println("Size: "+this.size);
    }
}
