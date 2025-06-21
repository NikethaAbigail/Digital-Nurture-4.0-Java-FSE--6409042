package strategy;

public class Main {
    public static void main(String[] args) {
       
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456");
        PaymentStrategy payPal = new PayPalPayment("user@example.com");

        // Create payment context
        PaymentContext context = new PaymentContext(creditCard);

        // Execute payment with credit card
        System.out.println("Processing payment with Credit Card:");
        context.executePayment(150.75);

        // Switch to PayPal strategy
        context.setPaymentStrategy(payPal);

        // Execute payment with PayPal
        System.out.println("\nProcessing payment with PayPal:");
        context.executePayment(75.25);
    }
}