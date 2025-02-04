public class Milk extends Decorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "milk ";
    }

    @Override
    public int getCost() {
        return super.getCost() + 3;
    }
}
