import java.util.Scanner;

public class SeparaParaules {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ini = 0;
        String frase;

        do {
            System.out.println("Escriu una frase no nula");
            frase = entrada.nextLine().trim();//trim elimina espacios por delante y por detras
            if (frase.isBlank()) {
                System.out.println("Una cadena no buida!");
                continue;
            }
            break;
        } while (true);

        do {
            int fi = frase.indexOf(' ', ini);
            if (fi != -1)
                System.out.println(frase.substring(ini, fi));//da -1 index si no troba pk arriba al final la paraula
            else {
                System.out.println(frase.substring(ini));
                break;
            }
            ini=fi+1;
        } while (true);
    }
}
