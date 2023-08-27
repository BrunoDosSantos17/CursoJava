package program;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int quantityProducts = scanner.nextInt();

        for (int i = 1; i <= quantityProducts; i++) {
            System.out.print("Product #"+ i +" data: \n");
            System.out.print("Common, used or imported (c/u/i)? ");
            scanner.nextLine();
            String origin = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Price: ");
            Double price = scanner.nextDouble();
            if(origin.equals("i")){
                System.out.print("Customs fee: ");
                Double fee = scanner.nextDouble();
                products.add(new ImportedProduct(name, price, fee));
            }else if(origin.equals("u")){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                scanner.nextLine();
                LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                products.add(new UsedProduct(name, price, date));
            }else{
                products.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS");
        for (Product prod : products) {
            System.out.println(prod.priceTag());
        }
        scanner.close();

    }
}