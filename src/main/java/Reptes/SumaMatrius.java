package Reptes;

import java.util.Scanner;

public class SumaMatrius {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tam = entrada.nextInt();
        int matriu1 [][] = new int[tam][tam];
        int matriu2 [][] = new int[tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                matriu1[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                matriu2[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print(matriu1[i][j]+matriu2[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
