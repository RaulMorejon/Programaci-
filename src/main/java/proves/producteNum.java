package proves;
import java.util.Scanner;

public class producteNum {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int casos = entrada.nextInt();

        for (int i = 0; i < casos; i++) {
            int suma = 0, producte = 1;
            int numero = entrada.nextInt();
            if (numero<=0) System.out.println("ELS NOMBRES NATURALS COMENCEN EN 1");
            else {
                for (int j = 1; j <=numero; j++) {
                    suma+=j;
                    producte*=j;
                }
                System.out.println("SUMA: "+suma+" PRODUCTE: "+producte);
            }
        }
    }
}
