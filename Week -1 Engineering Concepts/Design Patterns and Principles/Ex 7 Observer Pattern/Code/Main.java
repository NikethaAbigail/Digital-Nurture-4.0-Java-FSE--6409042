package observer;

public class Main {
    public static void main(String[] args) {
        
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobileApp = new MobileApp("Client1");
        Observer webApp = new WebApp("Client2");

        // Register observers
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Simulate a stock price change
        System.out.println("Initial stock price change to $105.50:");
        stockMarket.setStockPrice(105.50);

        // Deregister one observer
        stockMarket.deregisterObserver(webApp);

        
        System.out.println("\nStock price change to $107.25 after deregistering WebApp:");
        stockMarket.setStockPrice(107.25);
    }
}