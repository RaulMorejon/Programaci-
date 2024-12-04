import java.util.*;

public class VegadesCaracterIMPORTANT {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random r = new Random();
        /// control de rango
        int num = 0;
        do{
            System.out.println("Introdueix un enter positiu: ");
            num = entrada.nextInt();
            if(num<=0) System.out.println("Introdueix un numero mes gran de 0");
        }while(num<=0);
       /// contador
        int[] comptador = new int['Z'+'A'];
        System.out.println("Lletres: ");
        for (int i = 0; i < num; i++) {
            int lletra = (r.nextInt('Z'-'A'+1)+'A');
            System.out.printf("%c", lletra);
            comptador[lletra-'A']++;
        };
        System.out.println("");
        for (int i = 0; i <comptador.length ; i++) {
            if (comptador[i] > 0) System.out.printf("Vegades de la lletra %c: %d%n", (char)(i+'A') , comptador[i]);

        }
    }
}
