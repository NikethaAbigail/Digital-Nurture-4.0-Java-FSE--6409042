package adapter;

public class PayPalGateway {
    public void makePayment(double amountInUSD) {
        System.out.println("Processing payment of $" + amountInUSD + " via PayPal.");
    }
}
