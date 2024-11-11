package proves;

import java.util.Scanner;

public class ExplosionArcana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int explo = entrada.nextInt(), vida = entrada.nextInt();
        int explosions = 0, danActual = explo;

        while (vida > 0) {
            vida -= danActual;
            danActual *= 2;
            explosions++;
        }
        System.out.println(explosions);

    }
}
