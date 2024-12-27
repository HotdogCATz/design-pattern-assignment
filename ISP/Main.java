public class Main {
    public static void main(String[] args) {
        System.out.println("--- CEO Actions ---");
        CEO ceo = new CEO();
        ceo.salary();
        ceo.addBonus();
        ceo.makeDecision();
        ceo.addStock();

        System.out.println("\n--- Manager Actions ---");
        Manager manager = new Manager();
        manager.salary();
        manager.hire();
        manager.train();
        manager.addBonus();

        System.out.println("\n--- Employee Actions ---");
        Employee employee = new Employee();
        employee.salary();
    }
}