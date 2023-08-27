package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

    private LocalDate manufactureDate;


    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        StringBuilder strConcat = new StringBuilder();
        strConcat.append(super.name);
        strConcat.append(" (used) $ ");
        strConcat.append(super.price);
        strConcat.append(" (Manufacture date: ");
        strConcat.append( DateTimeFormatter.ofPattern("dd/MM/yyyy").format(this.manufactureDate));
        strConcat.append(")");
        return strConcat.toString();
    }
}
