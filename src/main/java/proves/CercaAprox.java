package proves;

import java.util.Scanner;

public class CercaAprox {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();

        for (int i = 0; i < casos; i++) {

            int n_talles = entrada.nextInt();
            int talles [] = new int[n_talles];
            for (int j = 0; j < n_talles; j++) {
                talles[j] = entrada.nextInt();
            }
            int talla = entrada.nextInt();
            boolean trobat = false;
            for (int x = 0; x < n_talles; x++) {
                if (talla == talles[x] || talla == talles[x]+1 || talla == talles[x]-1){
                    trobat = true;
                    break;
                }
            }
            System.out.println(trobat ? "SI":"NO");
        }
    }
}
