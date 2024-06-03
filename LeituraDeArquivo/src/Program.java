package src;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String path;
        String caminhoPadrao = "C:\\Projetos\\Java\\CursoJava\\LeituraDeArquivo\\temp";
        String config;

        Scanner sc = new Scanner(System.in);

        boolean existeArquivo = new File(caminhoPadrao + "\\Config.txt").exists();

        System.out.println(existeArquivo);
        System.out.println( existeArquivo ? "Deseja utilizar o arquivo de configuração? " : "Digite o caminho de pesquisa: ");
        path = sc.nextLine();

        if(path.equalsIgnoreCase("Yes") || path.equalsIgnoreCase("Y")) {
            System.out.println("Acessando arquivo de configuração");
            config = leituraArquivo(caminhoPadrao, "\\documento.csv");





        }else {
          arquivoConfig(path, caminhoPadrao + "\\Config.txt");
        }
    }

    public static String leituraArquivo(String caminho, String nomeArquivo) {
        File inFile = new File(caminho + nomeArquivo);
        File outFile = new File(caminho + "\\documentoModificado.csv");
        Scanner sc = null;
        String arquivo = "";
        try(BufferedReader inBr = new BufferedReader(new FileReader(inFile));
            BufferedWriter outBr = new BufferedWriter(new FileWriter(outFile))) {
            String line;
            while ((line = inBr.readLine()) != null) {
                String[] cells = line.split(",");
                StringBuilder processedLine = new StringBuilder();

                String produto = cells[0];
                String valorTotal = String.format("%.2f", (Float.parseFloat(cells[1]) * Float.parseFloat(cells[2]))).replace(',', '.');
                processedLine.append(produto);
                processedLine.append(", " + valorTotal);
                outBr.write(processedLine.toString());
                outBr.newLine();

            }


        } catch (FileNotFoundException e) {
            System.out.println("Problema na leitura do arquivo");;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

        return arquivo;
    }


    public static void arquivoConfig(String conteudo, String caminho) {
        System.out.println("\n");
        System.out.println(caminho);
        System.out.println(conteudo);
        System.out.println("------------------------------------");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {
            bw.write(conteudo);
        } catch (IOException e) {
            System.out.println("Falha na criação do arquivo de configuração");
            System.out.println(e);
        }
    }

}
