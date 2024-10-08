import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderManager {
    private List<Product> productList;
    public OrderManager(List<Product> productList){
        this.productList =productList;
    }
    public void sortProducts(List<Product> productList){
        Collections.sort(productList, Comparator.comparing(Product:: calculateTotalPrice)
                .thenComparing(Product::getName)
                .thenComparing(Product::getStockQuantity)
        );
    }
}
