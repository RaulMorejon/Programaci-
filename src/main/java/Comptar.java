import java.util.Scanner;

public class Comptar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();
        for (int i = 0; i < casos; i++) {

            int tam = entrada.nextInt();
            int array [] = new int[tam];
            for (int j = 0; j < tam; j++) {
                array[j] = entrada.nextInt();
            }
            int num = entrada.nextInt();
            int n_trobat = 0;
            for (int x = 0; x < tam; x++) {
                if (array[x] == num) n_trobat++;
            }
            System.out.println(n_trobat);
        }
    }


}
