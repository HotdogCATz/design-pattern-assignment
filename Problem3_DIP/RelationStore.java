public class RelationStore<T, U, V> {
    private final T value0;
    private final U value1;
    private final V value2;

    public RelationStore(T value0, U value1, V value2) {
        this.value0 = value0;
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue0() {
        return value0;
    }

    public U getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }
}