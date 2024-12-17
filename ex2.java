import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex2 {
    public static final int MAX = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        List<Integer> nums = getInput();
        sortNumbers(nums);
        displayNumbers(nums);
    }

    // Method to receive input
    public static List<Integer> getInput() {
        Scanner inp = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        System.out.println("Enter " + MAX + " valid integers in the range [0, 10]:");

        while (nums.size() < MAX) {
            String input = inp.nextLine();
            if (!isValidNumber(input)) {
                System.out.println("Invalid! Try again!");
                continue;
            }
            int num = Integer.parseInt(input);
            if (!isInRange(num)) {
                System.out.println("Invalid range! Try again!");
                continue;
            }
            nums.add(num);
        }
        inp.close();
        return nums;
    }

    // Method to check if the input is a valid integer
    public static boolean isValidNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Method to check number is within the range [0, 10]
    public static boolean isInRange(int num) {
        return num >= 0 && num <= 10;
    }

    // Method to sort the list of numbers
    public static void sortNumbers(List<Integer> nums) {
        Collections.sort(nums);
    }

    // Method to display the sorted numbers
    public static void displayNumbers(List<Integer> nums) {
        System.out.print("Sorted Numbers: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
