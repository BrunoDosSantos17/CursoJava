import entities.ContaTerminal;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc  = new Scanner(System.in);

        System.out.println("CRIAÇÃO DE CONTA BANCARIA");
        System.out.print("Número: ");
        int numero = sc.nextInt();
        System.out.print("Agencia com digito separado por virgula: ");
        String agencia = sc.next();
        System.out.print("Nome Cliente: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();

        ContaTerminal conta = new ContaTerminal(numero, agencia, nome, saldo);

        System.out.println("\n" + conta);

    }
}