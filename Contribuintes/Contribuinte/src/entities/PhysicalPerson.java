package entities;

public class PhysicalPerson extends Taxpayer{

    private Double healthExpenditure;

    public PhysicalPerson(String name, Double annualIncome, Double healthExpenditure) {
        super(name, annualIncome);
        this.healthExpenditure = healthExpenditure;
    }

    @Override
    public Double taxCalculation() {
        Double tax = 0.15;
        if(this.annualIncome > 2000){
            tax = 0.25;
        }
        this.restIncome = (this.annualIncome * tax) - (this.healthExpenditure * 0.5);
        return restIncome;
    }
}
