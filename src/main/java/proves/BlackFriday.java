package proves;

import java.util.Scanner;

public class BlackFriday {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int fila = entrada.nextInt(), columna = entrada.nextInt();
        int matriu [][] = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriu [i][j] = entrada.nextInt();
            }
        }
        int mult = entrada.nextInt();
        for (int i = 0; i < fila; i++) {
            for (int i1 = 0; i1 < columna; i1++) {
                System.out.print(matriu[i][i1]*mult+" ");
            }
            System.out.println();
        }
    }
}
