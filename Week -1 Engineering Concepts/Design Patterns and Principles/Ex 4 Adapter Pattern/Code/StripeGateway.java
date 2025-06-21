package adapter;

public class StripeGateway {
    public void charge(double amountInCents) {
        double amountInUSD = amountInCents / 100;
        System.out.println("Processing payment of $" + amountInUSD + " via Stripe.");
    }
}