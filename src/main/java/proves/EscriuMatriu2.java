package proves;

import java.util.Scanner;

public class EscriuMatriu2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int fila = entrada.nextInt(), columna = entrada.nextInt();
        int matriu[][] = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriu[i][j] = entrada.nextInt();
            }
        }
        int num1 = entrada.nextInt(), num2 = entrada.nextInt();
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if(matriu[i][j]==num1)matriu[i][j] = num2;
                System.out.print(matriu[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
