package proves;

import java.util.Scanner;

public class Bomberman {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int fila = entrada.nextInt(), columna = entrada.nextInt();
        int matriu [][] = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriu [i][j] = entrada.nextInt();
            }
        }
        int x_fil = entrada.nextInt(), y_col = entrada.nextInt(), suma = 0;
        for (int z = 0; z < columna; z++) {
            suma = suma + matriu[x_fil][z];
        }
        for (int p = 0; p < fila; p++) {
            suma = suma + matriu[p][y_col];
        }
        System.out.println(suma - matriu[x_fil][y_col]);
    }
}
