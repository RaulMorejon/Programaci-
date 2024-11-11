import java.util.Scanner;

public class Recordes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int casos = entrada.nextInt();

        for (int i = 0; i < casos; i++) {
            int tam = entrada.nextInt(), vect [] = new int[tam];
            for (int j = 0; j < tam; j++) {
                vect[j] = entrada.nextInt();
            }
            int casella = entrada.nextInt();
            System.out.println(vect[casella]);
        }
    }
}
