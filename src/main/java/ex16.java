import java.util.Random;
import java.util.Scanner;

public class ex16 {
    final static int FILA = 5;
    final static int COLUMNA = 10;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random num = new Random();

        int[][] matriu = new int[FILA][COLUMNA];
        int[] suma_fila = new int[FILA];
        int[] suma_columna = new int[COLUMNA];

        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                matriu[i][j] = num.nextInt(101);
                suma_fila[i] = suma_fila[i] + matriu[i][j];
                suma_columna[j] = suma_columna[j] + matriu[i][j];
            }
        }
        System.out.println("----------------------------------------------------------------------");
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                System.out.printf("%4d ", matriu[i][j]); //ordenar que queden alineados
            }
            System.out.print("\t| Suma fila: "+suma_fila[i]+" |");
            System.out.println(" ");
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Suma columna: ");
        for (int j=0; j<COLUMNA; j++){
            System.out.print(suma_columna[j]+"   ");
        }
        System.out.println("\n----------------------------------------------------------------------");
    }
}
