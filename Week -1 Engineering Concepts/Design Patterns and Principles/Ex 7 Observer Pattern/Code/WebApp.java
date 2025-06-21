package observer;

public class WebApp implements Observer {
    private String clientName;

    public WebApp(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println(clientName + " Web App: Stock price updated to $" + stockPrice + " at 11:04 PM IST, June 21, 2025.");
    }
}