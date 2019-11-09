package StringManipulation;

import java.util.*;

public class Message {
    public static void main(String[] args) {
        // Send Message: User will enter a message, if message is valid it will be sent,
        // there is a chance the message will not be delivered due to internet
        //> User takes a message that needs to be at least 15 characters
        //> If the message is valid user will see message: “sent” and “not sent” if the message was not valid
        //> If message was sent there is a 50 % chance the message will not be delivered.
        // >> If the message is delivered user will see message: “ delivered”
        //HINT: use random number for random chance to send

        Scanner s = new Scanner(System.in);
        System.out.println("Enter massage:");
        String message = s.nextLine();

        if (message.length() >= 15) {
            System.out.println("sent");
            Random r = new Random();
            int rNumber = r.nextInt(100); //chance the message will not be delivered
            System.out.println("Random number:"+rNumber);

            if (rNumber < 50) {
                System.out.println("Delivered");
            }
        } else {
            System.out.println("not sent");
        }

        //Scanner input = new Scanner(System.in);
        //        Random random = new Random();
        //        System.out.println("Enter your message");
        //        String message = input.nextLine();
        //        if(message.length() >= 15) {
        //            System.out.println("Message was sent");
        //            int num = random.nextInt(10); // 2
        //
        //            if(num % 2 == 0) {
        //                System.out.println("Message delivered");
        //            } else {
        //                System.out.println("Message was not delivered");
        //            }
        //
        ////            if(random.nextBoolean()) {
        ////                System.out.println("Message delivered");
        ////            } else {
        ////                System.out.println("Message was not delivered");
        ////            }
        //        } else {
        //            System.out.println("Message too short. Message not sent");
        //        }
    }
}


