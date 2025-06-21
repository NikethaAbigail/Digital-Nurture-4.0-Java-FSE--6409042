package adapter;

public class Main {
    public static void main(String[] args) {


        PaymentProcessor payPalProcessor = new PayPalAdapter();
        PaymentProcessor stripeProcessor = new StripeAdapter();

        
        System.out.println("Processing payment via PayPal:");
        payPalProcessor.processPayment(100.50);

        System.out.println("\nProcessing payment via Stripe:");
        stripeProcessor.processPayment(75.25);
    }
}