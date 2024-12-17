package ex2_with_OCP;

interface Specification<T>
{
    boolean isSatisfied(T item);
}

