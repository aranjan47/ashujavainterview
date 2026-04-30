
class BuyerThread extends Thread {
    private BananaSeller seller;
    private int quantity;
    private String buyerName;

    public BuyerThread(BananaSeller seller, int quantity, String buyerName) {
        this.seller = seller;
        this.quantity = quantity;
        this.buyerName = buyerName;
    }

    @Override
    public void run() {
        seller.sellBananas(quantity, buyerName);
    }
}

public class BananaMarket {
    public static void main(String[] args) {
        BananaSeller seller = new BananaSeller();

       
        BuyerThread buyer1 = new BuyerThread(seller, 5, "Buyer 1");
        BuyerThread buyer2 = new BuyerThread(seller, 5, "Buyer 2");

        
        buyer1.start();
        buyer2.start();

       
    }
}