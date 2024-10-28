package proves;

import java.util.Scanner;

public class Ambrosio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();

        for (int i = 0; i < casos; i++) {
            int pisos = entrada.nextInt();
            int bombons = 0;
            for (int j = 1; j <= pisos; j++) {
                bombons += j*j;
            }
            System.out.println(bombons);
        }
    }
}
