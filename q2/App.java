package q2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        FootballScore footballScore = new FootballScore();

        // Register two subscribers
        Subscriber subscriber1 = new Live("Subscriber 1");
        Subscriber subscriber2 = new Live("Subscriber 2");
        footballScore.registerSubscriber(subscriber1);
        footballScore.registerSubscriber(subscriber2);

        // Input loop
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Score: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) { // Terminate if empty input
                break;
            }

            footballScore.notifySubscribers(input);
        }

        System.out.println("Program terminated.");
        scanner.close();
    }
}
