package ex2_with_OCP;

import java.util.*;
import java.util.stream.*;
interface Filter<T>
{
    Stream<T> filter(List<T> items, Specification<T> spec);
}
