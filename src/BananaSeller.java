
class BananaSeller {
    private int bananasAvailable = 10;

    // Synchronized method to sell bananas
    public synchronized void sellBananas(int quantity, String buyer) {
        if (bananasAvailable >= quantity) {
            bananasAvailable -= quantity;
            System.out.println(quantity + " bananas sold to " + buyer + ". Remaining: " + bananasAvailable);
        } else {
            System.out.println("Sorry, not enough bananas available for " + buyer);
        }
    }
}