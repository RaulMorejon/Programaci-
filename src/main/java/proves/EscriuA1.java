package proves;
import java.util.Scanner;

public class EscriuA1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tam = entrada.nextInt();
        int vect [] = new int[tam];
        for (int i = 0; i < tam; i++) {
            vect[i] = entrada.nextInt();
        }
        int pos = entrada.nextInt();
        System.out.println(vect[pos]);
    }
}
