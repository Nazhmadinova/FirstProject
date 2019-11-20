package Constructor;

public class Phone {
    //Create a class Phone.
    //Instance variables: touchscreen, model, memory, color, phoneNumber.
    //Create a constructor that accepts two parameters(model, color) and set to corresponding instance variables.
    // Overload the constructor that accepts 4 parameters(model, color, memory, touchscreen).
    // Set values and check memory. If given memory is negative value then print “invalid memory”
    // and don’t set memory value. Otherwise set the memory value.

    boolean touchscreen;
    String model;
    int memory;
    String color;
    long phoneNumber;
    String text;

    public Phone(String model, String color){
        this.model=model;
        this.color=color;
    }

    public Phone(String model, String color, int memory, boolean touchscreen){
        this(model,color); //chaining constructor
        this.touchscreen=touchscreen;
        this.model=model;
        this.color=color;
        if(memory>=0){
            this.memory=memory;
            System.out.println(this.memory);
        }else{
            System.out.println("Invalid memory");
        }
    }
    //Create a method text that accepts long(phone number) and String(text) and returns boolean.
    // Check given number length and text body.
    //Print: “%textBody sent to %givenPhoneNumber” if length is 10 and text body is not empty then return true;
    // Print: “Invalid phone number or text body” and return false if otherwise.

    public boolean text(long number, String text){
        String num= number+"";
        if(num.length()==10 && !text.isEmpty()){
            this.phoneNumber=number;
            this.text=text;
            System.out.println(text+" sent to "+number);
            return true;
        }
        System.out.println("Invalid phone number or text body");
        return false;
    }

    //Create a method call that accepts long (phone number). Print “Calling to %phoneNumber”
    // if phone number length is 10. Print “Invalid phone number” if otherwise.

    public void call(long number){
        String num= number+"";
        if(num.length()==10){
            this.phoneNumber=number;
            System.out.println("Calling to "+phoneNumber);
        }else{
            System.out.println("Invalid phone number");
        }

    }
}
