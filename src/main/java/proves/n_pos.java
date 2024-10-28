package proves;
import java.util.Scanner;

public class n_pos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int casos = entrada.nextInt();
        int contador = 0;
        for (int i = 0; i < casos; i++) {
            int num = entrada.nextInt();
            if (num>0) contador++;
        }
        System.out.println(contador);

    }
}
