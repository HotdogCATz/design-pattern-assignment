public class FactoryMethodGOFDemo {
    public static void main(String[] args) {
        AutomobileDisplay myDisplay = AutomobileDisplayFactory.getAutomobileDisplay("ford");
        myDisplay.displayAutomobile();

        AutomobileDisplay anotherDisplay = AutomobileDisplayFactory.getAutomobileDisplay("toyota");
        anotherDisplay.displayAutomobile();
    }
}