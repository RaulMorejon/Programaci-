package Reptes;

import java.util.Scanner;

public class Bola_del_Projector {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int casos = entrada.nextInt();
        for (int i = 0; i < casos; i++) {


            int distanciaEntre = entrada.nextInt();//distancia de la cara al cordell
            int nCordills = entrada.nextInt(); // n trozos de cuerda entre 1 i 10

            int longTros [] = new int[nCordills]; //longitud de cada trozo, no se repite ninguno (entre 1 i 100)

            int resultat = 0;
            while (resultat<distanciaEntre){

                for (int j = 0; j < nCordills; j++) {
                    if (longTros[j] == distanciaEntre) {
                        resultat = distanciaEntre;
                        break;
                    }else{
                        resultat = longTros[j] + resultat;

                    }


                }
            }
            System.out.println(resultat == distanciaEntre ?  "SI":"NO");


        }

    }
}
