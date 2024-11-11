package proves;

import java.util.Scanner;

public class Multiplica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();

        for (int i = 0; i < casos; i++) {

            int n_num = entrada.nextInt();
            int numeros [] = new int[n_num];
            for (int j = 0; j < n_num; j++) {
                numeros[j] = entrada.nextInt();
            }
            int mult = entrada.nextInt();
            for (int x = 0; x < n_num; x++) {
                System.out.print(numeros[x]*mult+" ");
            }
            System.out.println();
        }
    }
}
