package proves;

import java.util.Scanner;

public class Buscar_letra {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String cadena = "holafasdkjfoasdjfoamsdlfmsdajnbaodn";

        int cont = 0;
        int index = cadena.indexOf('a',0); //last index of empieza por la derecha

        while (index != -1) {
            cont++;
            index = cadena.indexOf('a', index+1);
        }
        System.out.println("hay "+cont+" 'a' s");

    }
}
