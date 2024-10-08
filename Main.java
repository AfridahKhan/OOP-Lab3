import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("Laptop", 5, 1200));
        products.add(new Clothing("Shirt", 6, 200));
        products.add(new Furniture("Chair", 7, 600));
        products.add(new Electronics("Computer", 1, 12000));

        OrderManager om= new OrderManager(products);
        om.sortProducts(products);
        System.out.println("\nSorted Products:");
        for (Product product : products) {
            System.out.println(product);
        }

    }
}