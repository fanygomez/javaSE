package p7;

public class StockRoom {
    private int stock = 10;
    private int qty;
    public void purchase(int qty){
        stock += qty;
    }
    public void sell(int qty){
        stock -=qty;
    }

    public void printStock(String action){
        System.out.println(action+" : "+qty+" items. Stock in Hand: "+stock);
    }

    public static void main(String[] args) {
        StockRoom k1 = new StockRoom();
        k1.sell(5);
        k1.sell(5);
        k1.printStock("Sold");

        StockRoom k2 = new StockRoom();
        k2.purchase(5);
        k2.printStock("Purchased");
    }
}
