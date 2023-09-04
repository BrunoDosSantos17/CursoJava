package entities;

public class LegalPerson extends Taxpayer{
    private int employee;
    public LegalPerson(String name, Double annualIncome, int employee) {
        super(name, annualIncome);
        this.employee = employee;
    }

    @Override
    public Double taxCalculation() {
        double tax = 0.16;
        if(this.employee > 10){
            tax = 0.14;
        }

        this.restIncome = this.annualIncome * tax;

        return restIncome;
    }
}
