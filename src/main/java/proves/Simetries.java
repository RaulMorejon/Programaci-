package proves;

import java.util.Scanner;

public class Simetries {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int casos = entrada.nextInt();
        for (int i = 0; i < casos; i++) {

            int fila = entrada.nextInt(), columna = entrada.nextInt();

            char matriu [][] = new char[fila][columna];
            for (int j = 0; j < fila; j++) {
                for (int k = 0; k < columna; k++) {
                    matriu[fila][columna] = entrada.next().charAt(0);
                }
            }




        }

    }
}
