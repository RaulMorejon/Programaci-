package proves;

import java.util.Scanner;

public class MaximMatriu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();
        for (int i = 0; i < casos; i++) {
            int fila = entrada.nextInt(), columna = entrada.nextInt();
            int matriu[][] = new int[fila][columna];
            int fil_max = 0, col_max = 0;
            int mayor = 0;
            for (int y = 0; y < fila; y++) {
                for (int j = 0; j < columna; j++) {
                    matriu[y][j] = entrada.nextInt();
                    if(matriu[y][j]>mayor) {
                        mayor = matriu[y][j];
                        fil_max = y;
                        col_max = j;
                    }
                }
            }
            System.out.println((fil_max+1)+" "+(col_max+1));

        }
    }
}
