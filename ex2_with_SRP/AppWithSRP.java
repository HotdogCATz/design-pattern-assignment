import java.util.Scanner;

public class AppWithSRP {
	public static void main(String[] args) {
		System.out.println("Welcome to the Application!");

		// Read inputs
		PairOfInput pair = PairOfInputProcessor.read();

		if (PairOfInputProcessor.isValid(pair)) {
			int firstInt = Integer.parseInt(pair.getFirst());
			int secondInt = Integer.parseInt(pair.getSecond());

			// Select an operation
			BinaryOperation operation = chooseOperation();

			// Perform the operation
			int result = operation.operate(firstInt, secondInt);
			System.out.println("The result is: " + result);
		} else {
			System.out.println("Invalid number");
		}

		System.out.println("End of the application!");
	}

	// Method to make user can choose operation
	public static BinaryOperation chooseOperation() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Choose an operation: 1) Addition 2) Subtraction");
		int choice = inp.nextInt();

		if (choice == 2) {
			return new SubtractionOperation();
		} else {
			return new MathOperation();
		}
	}
}
