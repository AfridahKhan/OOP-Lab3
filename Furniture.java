public class Furniture extends Product{
    private double taxRate = .08;

    public Furniture(String name, int stockQuantity, int unitPrice) {
        super(name, stockQuantity, unitPrice);
    }
    public double calculateTotalPrice(){
        return unitPrice + (unitPrice*taxRate);
    }
}
