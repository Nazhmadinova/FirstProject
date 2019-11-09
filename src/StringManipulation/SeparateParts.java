package StringManipulation;

public class SeparateParts {
    public static void main(String[] args) {
        //User will be given a string:
        // “Sender: <James Bond>. From Number: [202-123-3456]. Message: {“I love programming and problem solving}”
        // > You will separate these parts and print them separately.
        // > Print the following:
        // “Sender:  actualSender”
        // “Number: actualNumber”
        // “Message: actualMessage”
        String given = "Sender: <James Bond>. From Number: [202-123-3456]. \n" +
                "Message: {“I love programming and problem solving\"}";
        int from = given.indexOf("From");
        int message = given.indexOf("Message");
        String sender= given.substring(0,(from-1));
        String number = given.substring(from,(message-1));
        String message2 = given.substring(message);
        System.out.println(sender);
        System.out.println(number);
        System.out.println(message2);
    }
}
