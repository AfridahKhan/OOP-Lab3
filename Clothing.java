public class Clothing extends Product{
     private double taxRate = 0.10;

    public Clothing(String name, int stockQuantity, int unitPrice) {
        super(name, stockQuantity, unitPrice);
    }

    public double calculateTotalPrice(){
        return unitPrice + (unitPrice*taxRate);
    }
}
