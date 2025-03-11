package q4;

class CoffeePot extends Component {
    public CoffeePot(Mediator mediator) {
        super(mediator);
    }

    public void doCoffeePot() {
        System.out.println("I am coffee pot,... doing my task");
        mediator.notify(this, "Coffee Pot");
    }
}