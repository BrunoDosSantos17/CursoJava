package entities;

public class Employee {

    int id;

    String name;

    double salary;

    public Employee(int ID, String name, double salary) {
        this.id = ID;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void increaseSalary(double percentage) {
        this.salary += this.salary * percentage / 100;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return  id +
               ", " + name +
               ", " + String.format("%.2f", salary) ;
    }

}
