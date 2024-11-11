import java.util.Scanner;

public class Macarrisme {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tam = entrada.nextInt();
        double vect [] = new double[tam];
        for (int i = 0; i < tam; i++) {
            vect[i] = entrada.nextDouble();
            System.out.printf("%.1f%",vect[i]*100);
        }
    }
}
