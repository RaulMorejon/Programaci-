package proves;

import java.util.Scanner;

public class EleccionsPatates {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();

        for (int i = 0; i < casos; i++) {
            int opcions = entrada.nextInt();
            int guanyador = 0;
            int punts_mayor = 0;
            for (int j = 0; j < opcions; j++) {
                int vots = entrada.nextInt();
                if(vots > punts_mayor ){
                    punts_mayor = vots;
                    guanyador = j;
                }
            }
            System.out.println(guanyador+=1);
        }
    }
}
