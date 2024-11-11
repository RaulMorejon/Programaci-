package proves;

import java.util.Scanner;

public class TresPerCinc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt(), vegades = entrada.nextInt();

        for (int i = 0; i < vegades; i++) {
            System.out.print(numero);
        }
    }
}
