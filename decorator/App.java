
public class App {
	public static void main(String[] args) {
		// order normal beverage
		System.out.println("------------------------ Order Normal Beverage -------------------------");

		Beverage plainBeverage = new PlainBeverage();
		System.out.println("You order " + plainBeverage.getDescription());
		System.out.println("The cost is " + plainBeverage.getCost());

		System.out.println("------------------------ Order 1 Milk and 2 Sugar -------------------------");
		Beverage customBeverage = new PlainBeverage();
		customBeverage = new Milk(customBeverage);
		customBeverage = new Sugar(customBeverage);
		customBeverage = new Sugar(customBeverage);

		System.out.println("You order " + customBeverage.getDescription());
		System.out.println("The cost is " + customBeverage.getCost());
	}
}
