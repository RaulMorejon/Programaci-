package proves;

import java.util.Scanner;

public class MatriuTransposada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int fila = entrada.nextInt(), columna = entrada.nextInt();
        int matriu[][] = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriu[i][j] = entrada.nextInt();
            }
        }
        int matriu_t[][] = new int[columna][fila];
        for (int i = 0; i < columna; i++) {
            for (int j = 0; j < fila; j++) {
                matriu[i][j] = entrada.nextInt();
            }
        }

    }
}
