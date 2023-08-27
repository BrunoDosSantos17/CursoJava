package entities;

public class ImportedProduct extends Product{

    private Double customsFee;
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return super.price + customsFee;
    }

    @Override
    public String priceTag() {
        StringBuilder strConcat = new StringBuilder();
        strConcat.append(super.name);
        strConcat.append(" $ ");
        strConcat.append(String.format("%.2f", this.totalPrice()));
        strConcat.append(" (Customs fee: $ ");
        strConcat.append(String.format("%.2f", this.customsFee));
        strConcat.append(")");
        return strConcat.toString();
    }
}
