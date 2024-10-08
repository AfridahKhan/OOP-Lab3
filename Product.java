abstract class Product {
    protected String name;
    protected int stockQuantity;
    protected int unitPrice;

    public Product(String name, int stockQuantity, int unitPrice) {
        this.name = name;
        this.stockQuantity = stockQuantity;
        this.unitPrice = unitPrice;
    }

    public abstract double calculateTotalPrice();

    public String getName(){
        return name;
    }
    public int getStockQuantity(){
        return stockQuantity;
    }
    public double getUnitPrice(){
        return unitPrice;
    }

    public String toString() {
        return name + " - Price: " + calculateTotalPrice() + " - Stock: " + stockQuantity;
    }


}
