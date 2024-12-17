package ex2_with_OCP;

public interface ISpecification<T>
{
    boolean isSatisfied(T item);
}

