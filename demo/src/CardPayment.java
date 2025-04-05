public class CardPayment implements PaymentStrategy{
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing Card Payment: $" + amount);
        System.out.println("Forwarding payment to card processor...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Processing processed successfully.");
        return true;
    }
}
