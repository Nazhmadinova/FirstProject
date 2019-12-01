package StaticClass;

public class BestBuyTest {
    public static void main(String[] args) {
        BestBuy storeOne = new BestBuy("Chicago","Friday");
        BestBuy storeTwo = new BestBuy("Fasd","wednesday");
        BestBuy.numOfComputers--;


        System.out.println(BestBuy.numOfComputers);
       BestBuy.numberOfComputers();
        System.out.println(storeOne.numOfComputers);
        storeOne.numOfComputers--;
        storeOne.numOfComputers=20;
        System.out.println(storeTwo.numOfComputers);
    }
}
