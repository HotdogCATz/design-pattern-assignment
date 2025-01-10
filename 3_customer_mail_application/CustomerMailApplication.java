import java.util.Scanner;

public class CustomerMailApplication {
    private final Customer customer;

    public CustomerMailApplication(Customer customer) {
        this.customer = customer;
    }

    public static String getCustomerTypeFromUser() {
        String customerType = null;
        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent: ");
            int type = inp.nextInt();
            switch (type) {
                case 1 -> customerType = "Regular";
                case 2 -> customerType = "Mountain";
                case 3 -> customerType = "Delinquent";
                default -> {
                    System.out.println("Invalid choice. Please run the program again.");
                    System.exit(1);
                }
            }
        }
        return customerType;
    }

    public void displayCustomerCommunications() {
        System.out.println(customer.createMail());
        System.out.println(customer.createBrochure());
    }

    public static void main(String[] args) {
        String customerType = getCustomerTypeFromUser();
        Customer customer = CustomerMailFactory.createCustomer(customerType);
        CustomerMailApplication app = new CustomerMailApplication(customer);
        app.displayCustomerCommunications();
    }
}
