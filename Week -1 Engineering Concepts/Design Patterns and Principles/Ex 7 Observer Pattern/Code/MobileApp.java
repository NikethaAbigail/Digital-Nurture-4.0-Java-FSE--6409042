package observer;

public class MobileApp implements Observer {
    private String clientName;

    public MobileApp(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println(clientName + " Mobile App: Stock price updated to $" + stockPrice + " at 11:04 PM IST, June 21, 2025.");
    }
}