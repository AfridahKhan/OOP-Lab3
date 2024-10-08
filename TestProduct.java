import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;


public class TestProduct {
    @Test
    public void testElectronicsTotalPrice() {
        Product laptop = new Electronics("Laptop", 5, 1200);
    assertEquals(1380.0, laptop.calculateTotalPrice());
}
    @Test
    public void testFurnitureTotalPrice(){
        Product table = new Furniture("Table",50,150);
        assertEquals(162.0, table.calculateTotalPrice());
    }
    @Test
    public void testClothingTotalPrice() {
        Product tshirt = new Clothing("T-Shirt", 30, 20);
        assertEquals(22.0, tshirt.calculateTotalPrice());
    }
    @Test
    public void testOrderByTotalPrice() {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("Laptop", 5, 1200));
        products.add(new Clothing("T-Shirt", 30, 20));
        products.add(new Furniture("Chair", 50, 150));

        OrderManager om = new OrderManager(products);
        om.sortProducts(products);

        assertEquals("T-Shirt", products.get(0).getName());
        assertEquals("Chair", products.get(1).getName());
        assertEquals("Laptop", products.get(2).getName());
    }


}
