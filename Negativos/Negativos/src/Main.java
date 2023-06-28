import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arraySize;
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar?");
        arraySize = sc.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Digite um numero:");
            array[i] = sc.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < arraySize; i++) {
            if (array[i] < 0) {
                System.out.println(array[i]);
            }

        }
    }
}