import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int casos = entrada.nextInt();
        for (int i = 0; i < casos ; i++) {
            int numero = entrada.nextInt();
            for (int j = 1; j <= numero ; j++) {
                if(numero%j==0) System.out.print(j+" ");
            }
            System.out.println(" ");
        }

    }
}
//finalizado