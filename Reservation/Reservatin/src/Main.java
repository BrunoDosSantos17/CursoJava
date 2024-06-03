import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Desafio 1 - Mostre a lista na ordem numérica");
        numeros.stream().sorted().forEach(System.out::print);
        System.out.println("\nDesafio 2 - Imprima a soma dos números pares da lista");
        Integer soma  = numeros.stream().filter(numeroPar -> numeroPar%2 == 0).reduce(0, Integer::sum);
        System.out.print("Soma dos número pares: " + soma);
        System.out.println("\nDesafio 3 - Verifique se todos os números da lista são positivos");
        if (numeros.stream().anyMatch(numeroPar -> numeroPar > 0)) {
            System.out.println("Todos positivos");
        } else {
            System.out.println("Nem todos são positivos");
        }
        System.out.println("Desafio 4 - Remova todos os valores ímpares:");
        numeros.stream().filter(numeroPar -> numeroPar%2 == 0).forEach(System.out::print);
        System.out.println("\nDesafio 5 - Calcule a média dos números maiores que 5");
        List<Integer> numerosMaior = numeros.stream().filter(numero -> numero > 5).toList();
        System.out.println(numerosMaior.stream().reduce(0, Integer::sum) / numerosMaior.size());
        System.out.println("Desafio 6 - Verificar se a lista contém algum número maior que 10");
        List<Integer> numeroMaiorDez =  numeros.stream().filter(numero -> numero > 10).toList();
        if (numeroMaiorDez.size() <= 0){
            System.out.println("Não possui numero maior que 10");
        }else {
            System.out.println(numeroMaiorDez.size());
            numeroMaiorDez.forEach(System.out::print);
        }

    }
}