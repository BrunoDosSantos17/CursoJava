import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int countRegistration;
        double upPercentageSalary;

        Locale.setDefault(Locale.US);

        List<Employee> employeeList = new ArrayList<Employee>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        countRegistration = sc.nextInt();
        System.out.println();

        for (int i = 0; i < countRegistration; i++) {
            System.out.println("Employee #" + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employeeList.add(new Employee(id, name, salary));
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idEmployeeUpSalary = sc.nextInt();

        Employee employeeId = employeeList.stream().filter(employee -> employee.getId() == idEmployeeUpSalary).findFirst().orElse(null);

        if (employeeId == null) {
            System.out.println("This id does not exist! ");
        }else {
            System.out.print("Enter the percentage: ");
            upPercentageSalary = sc.nextDouble();
            employeeId.increaseSalary(upPercentageSalary);
        }
        System.out.println();
        System.out.println("List of employees: ");

        for (Employee emp: employeeList) {
            System.out.println(emp);
        }

    }
}