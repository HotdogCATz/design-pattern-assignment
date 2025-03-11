package q4;

class Alarm extends Component {
    public Alarm(Mediator mediator) {
        super(mediator);
    }

    public void doAlarm() {
        System.out.println("Alarm is ringing...");
        mediator.notify(this, "AlarmTriggered");
    }
}