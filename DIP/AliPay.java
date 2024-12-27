public class AliPay implements PaymentMethod {
	@Override
	public void pay() {
		System.out.println("Paying with AliPay...");
	}
}