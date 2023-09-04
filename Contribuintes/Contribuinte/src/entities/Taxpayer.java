package entities;

public abstract class Taxpayer {
    protected String name;
    protected Double annualIncome;

    protected Double restIncome;

    public Taxpayer(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public abstract Double taxCalculation();

    @Override
    public String toString() {
        return this.name + ": $" + String.format("%.2f", this.taxCalculation());
    }

    public Double getRestIncome() {
        return restIncome;
    }
}
