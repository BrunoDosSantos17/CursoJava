import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double areaX = returnArea("X", sc);
        double areaY = returnArea("Y", sc);
        result(areaX, areaY);

    }

    private static void result(double areaX, double areaY) {
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        System.out.println("Larger area: " + (areaX > areaY ? "X" : "Y"));
    }

    private static double returnArea(String triangleName, Scanner sc) {

        double a, b, c, p;
        System.out.println("Enter the measures of triangle" + triangleName + ": ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        p = (a+ b+ c) / 2;

        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }

}