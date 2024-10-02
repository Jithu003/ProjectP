public class PaymentGateway {
    private PaymentStrategy paymentStrategy;

    public PaymentGateway(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(int amount) {
        paymentStrategy.pay(amount);
    }

    public static void main(String[] args) {
        PaymentGateway gateway1 = new PaymentGateway(new CreditCardPayment("1234-5678-9876-5432"));
        gateway1.processPayment(500);

        PaymentGateway gateway2 = new PaymentGateway(new PayPalPayment("user@example.com"));
        gateway2.processPayment(250);

        PaymentGateway gateway3 = new PaymentGateway(new CryptoPayment("wallet123xyz"));
        gateway3.processPayment(1000);
    }
}
