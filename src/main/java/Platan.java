import java.util.*;

public class Platan {
    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);

        char letra = entrada.next().charAt(0);
        int cont_p = 0;
        int cont_b = 0;

        while (letra != '0'){
            if (letra == 'P') cont_p++;
            else if (letra == 'B') cont_b++;
            letra = entrada.next().charAt(0 );
        }
        if (cont_p==cont_b) System.out.println("No puc distingir entre un platan i una banana");
        else System.out.println( (cont_p>cont_b) ? "M'agraden els platans":"M'agraden les bananes");

    }
}


