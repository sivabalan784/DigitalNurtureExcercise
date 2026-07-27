interface PaymentProcessor {
    void processPayment(double amount);
}
class PayPalGateway {
    public void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " processed through PayPal.");
    }
}
class StripeGateway {
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " processed through Stripe.");
    }
}
class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPalGateway;
    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }
    @Override
    public void processPayment(double amount) {
        payPalGateway.makePayment(amount);
    }
}
class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;
    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }
    @Override
    public void processPayment(double amount) {
        stripeGateway.pay(amount);
    }
}
public class Main {
    public static void main(String[] args) {
        PaymentProcessor payPal =
                new PayPalAdapter(new PayPalGateway());
        PaymentProcessor stripe =
                new StripeAdapter(new StripeGateway());
        payPal.processPayment(5000);
        stripe.processPayment(2500);
    }
}