package proves;

import java.util.Scanner;

public class cmesmes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        System.out.println(numero>=0 ? numero+1:numero-1);
    }
}
