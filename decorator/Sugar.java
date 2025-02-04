public class Sugar extends Decorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "sugar ";
    }

    @Override
    public int getCost() {
        return super.getCost() + 1;
    }
}
