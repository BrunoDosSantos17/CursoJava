package org.example;

import org.example.entitie.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String caminho = "C:\\Projetos\\Java\\CursoJava\\lambda2\\src\\main\\java\\org\\example\\utils\\arquivo.csv";

        try(BufferedReader arquivo = new BufferedReader(new FileReader(caminho))) {

            Stream<String> linhas = arquivo.lines();
            List<Employee> employees = new ArrayList<>();

            linhas.forEach(employee -> {
                String [] fields = employee.split(",");
                if(fields.length > 2) {
                    employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])) );
                }
            });

            Double salary = 2000.00;

            List<String> emails = employees.stream().filter(e -> e.getSalary() > salary ).map(e -> e.getEmail()).sorted().collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than: " + String.format("%.2f", salary ));
            emails.forEach(System.out::println);

            Double salaryEmployeesM = employees.stream().filter(e -> e.getName().charAt(0) == 'M' ).map(Employee::getSalary).reduce(0.0, Double::sum);

            System.out.println("Sum of salary of people whose name starts with 'M': " + salaryEmployeesM);


        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}