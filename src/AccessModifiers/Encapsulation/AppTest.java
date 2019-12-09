package AccessModifiers.Encapsulation;

public class AppTest {
    public static void main(String[] args) {
        App whatsapp = new App("WhatsApp", "Social Network",2.3);
        whatsapp.info();
        whatsapp.update();
        whatsapp.setSize(2.6);
        whatsapp.info();
        System.out.println(App.getNumberOfApps());

       // System.out.println(whatsapp.getReviews());
        whatsapp.setReview("HFG");
        System.out.println(whatsapp.getReviews());
    }
}
