package proves;

import java.util.Scanner;

public class IndexMatriu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int fila = entrada.nextInt(), columna = entrada.nextInt();
        int matriu[][] = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriu[i][j] = entrada.nextInt();
            }
        }
        int num = entrada.nextInt();
        int fila_t = -1, col_t = -1;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if(matriu[i][j] == num){
                    fila_t = i;
                    col_t = j;
                    break;
                }
            }
        }
        System.out.println(fila_t+" "+col_t);
    }
}
