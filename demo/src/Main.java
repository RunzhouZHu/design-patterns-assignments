import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PaymentContext paymentHandler = new PaymentContext(new CashPayment());

        // read amount
        System.out.println("Enter the amount: ");
        double amount = scanner.nextDouble();

        System.out.println("Select payment method: ");
        System.out.println("1. Cash");
        System.out.println("2. Card");
        System.out.println("2. Gift Card");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                paymentHandler.setPaymentStrategy(new CashPayment());
                break;
            case 2:
                paymentHandler.setPaymentStrategy(new CardPayment());
                break;
            case 3:
                paymentHandler.setPaymentStrategy(new GiftCardPayment());
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        // Process the payment
        boolean result = paymentHandler.processPayment(amount);
        if (result) {
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment failed!");
        }

    }
}