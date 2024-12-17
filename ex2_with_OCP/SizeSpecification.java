package ex2_with_OCP;

public class SizeSpecification implements ISpecification<Product>
{
    private Size size;

    public SizeSpecification(Size size)
    {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item)
    {
        return item.size == size;
    }
}
