package q4;

public class App {
    public static void main(String[] args) {
        HomeMediator mediator = new HomeMediator();
        
        Alarm alarm = new Alarm(mediator);
        Sprinkler sprinkler = new Sprinkler(mediator);
        CoffeePot coffeePot = new CoffeePot(mediator);
        
        mediator.setAlarm(alarm);
        mediator.setSprinkler(sprinkler);
        mediator.setCoffeePot(coffeePot);
        
        alarm.doAlarm();
    }
}