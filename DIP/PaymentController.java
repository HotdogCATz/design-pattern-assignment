public class PaymentController {
    private PaymentMethod paymentMethod;

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay() {
        if (paymentMethod != null) {
            paymentMethod.pay();
        } else {
            System.out.println("No payment method set.");
        }
    }
}