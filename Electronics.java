public class Electronics extends Product{
    private double taxRate= .15;

    public Electronics(String name, int stockQuantity, int unitPrice) {
        super(name, stockQuantity, unitPrice);

    }

    @Override
    public double calculateTotalPrice() {
        return unitPrice+ (unitPrice*taxRate);
    }
}
