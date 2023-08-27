package entities;

public class Product {
    String name;
    Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String priceTag(){
        return name +
                " $ " +
                String.format("%.2f", price);
    }
}
