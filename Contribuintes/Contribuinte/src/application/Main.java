package application;

import entities.LegalPerson;
import entities.PhysicalPerson;
import entities.Taxpayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Taxpayer> taxpayers = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int payers = scanner.nextInt();

        for (int i = 1; i <= payers; i++) {
            System.out.println("Tax payer #" + i + " data");

            System.out.print("Individual or company (i/c)? ");
            char categoryEmployer = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Annual income: ");
            Double annualIncome = scanner.nextDouble();
            if(categoryEmployer == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExpenditures = scanner.nextDouble();;
                taxpayers.add(new PhysicalPerson(name, annualIncome, healthExpenditures));
            }else {
                System.out.print("Number of employees: ");
                int numberEmployees = scanner.nextInt();
                taxpayers.add(new LegalPerson(name, annualIncome, numberEmployees));
            }
        }
        System.out.println("\nTAXES PAID: ");
        double totalTaxes = 0;
        for (Taxpayer taxpayer: taxpayers) {
            System.out.println(taxpayer);
            totalTaxes += taxpayer.getRestIncome();
        }

        System.out.print("\nTOTAL TAXES: $ " + String.format("%.2f",totalTaxes));

    }
}