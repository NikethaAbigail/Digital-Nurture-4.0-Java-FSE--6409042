package adapter;

public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;

    public StripeAdapter() {
        this.stripeGateway = new StripeGateway();
    }

    @Override
    public void processPayment(double amount) {
        stripeGateway.charge(amount * 100); // Convert USD to cents
    }
}