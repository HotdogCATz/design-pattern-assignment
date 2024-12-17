package ex2_with_OCP;

import java.util.*;
public class SOLID_O {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL, Price.LOW);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE, Price.MEDIUM);
        Product house = new Product("House", Color.BLUE, Size.LARGE, Price.HIGH);

        List<Product> products = List.of(apple, tree, house);

        ProductFilter pf = new ProductFilter();

        System.out.println("Green products: (new)");
        pf.filter(products, new ColorSpecification(Color.GREEN))
            .forEach(p -> System.out.println(" - " + p.name + " is green"));

        System.out.println("\nSmall products: (new)");
        pf.filter(products, new SizeSpecification(Size.SMALL))
            .forEach(p -> System.out.println(" - " + p.name + " is small"));

        System.out.println("\nHigh price products: (new)");
        pf.filter(products, new PriceSpecification(Price.HIGH))
            .forEach(p -> System.out.println(" - " + p.name + " is high priced"));

        System.out.println("\nBlue AND Large AND High price products: (new)");
        pf.filter(products, 
            new AndSpecification<>(
                new ColorSpecification(Color.BLUE),
                new AndSpecification<>(
                    new SizeSpecification(Size.LARGE),
                    new PriceSpecification(Price.HIGH)
                )
            ))
            .forEach(p -> System.out.println(" - " + p.name + " is blue, large, and high priced"));
    }
}