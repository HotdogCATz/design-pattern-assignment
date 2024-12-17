package ex2_with_OCP;

public class PriceSpecification implements ISpecification<Product> {
    private Price price;

    public PriceSpecification(Price price) {
        this.price = price;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.price == price;
    }
}