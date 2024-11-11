package proves;

import java.util.Scanner;

public class EscriuMatriu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int fila = entrada.nextInt(), columna = entrada.nextInt();
        int matriu[][] = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriu[i][j] = entrada.nextInt();
            }
        }
        int fil = entrada.nextInt(), col = entrada.nextInt();
        int valor = 0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if(fil == i && col == j) valor = matriu[i][j];
                System.out.print(matriu[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println(valor);
    }
}
