import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de colunas: ");
        int columns = sc.nextInt();
        System.out.print("Digite o número de linhas: ");
        int lines = sc.nextInt();

        Integer[][] matrix = new Integer[columns][lines];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite o número que deseja encontrar na matrix: ");
        int foundNum = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == foundNum){
                    System.out.println("Position " + i + "," + j + ": ");
                    if((j - 1) >= 0) {
                        System.out.println("Left: " + matrix[i][j-1]);
                    }
                    if(matrix[i].length > (j + 1)) {
                        System.out.println("Right: " + matrix[i][j+1]);
                    }
                    if((i - 1) >= 0 ) {
                        System.out.println("Up: " + matrix[i-1][j]);
                    }
                    if(matrix.length > (i + 1)) {
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                }
            }
        }


    }
}