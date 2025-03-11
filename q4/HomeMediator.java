package q4;

class HomeMediator implements Mediator {
    private Alarm alarm;
    private Sprinkler sprinkler;
    private CoffeePot coffeePot;

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public void setSprinkler(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    public void setCoffeePot(CoffeePot coffeePot) {
        this.coffeePot = coffeePot;
    }

    @Override
    public void notify(Component sender, String event) {
        if (event.equals("AlarmTriggered")) {
            System.out.println("Alarm triggered, notifying devices...");
            sprinkler.doSprinkler();
            coffeePot.doCoffeePot();
        } else {
            System.out.println(event + " has finished its task.");
        }
    }
}