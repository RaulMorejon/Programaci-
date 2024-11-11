package proves;

import java.util.Scanner;

public class MIdentitat {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tam = entrada.nextInt();
        int matriu [][] = new  int[tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i==j) System.out.print(1+" ");
                else System.out.print(0+" ");
            }
            System.out.println();
        }

    }
}
