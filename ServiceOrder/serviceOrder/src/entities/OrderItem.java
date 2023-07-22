package entities;

public class OrderItem {

    private Integer quantity;
    private Product product;

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public double subTotal(){
        return quantity * product.getPrice();
    }

    @Override
    public String toString() {
        return product.getName() + ", Quantity: " + quantity + ", Subtotal: " + String.format("%.2f", subTotal()) + "\n";
    }
}
