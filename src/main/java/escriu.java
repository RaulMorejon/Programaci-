import java.util.Scanner;

public class escriu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tam = entrada.nextInt();
        int vect [] = new int[tam];
        for (int i = 0; i < tam; i++) {
            vect[i] = entrada.nextInt();
        }
        int num = entrada.nextInt();
        for (int j = 0; j < tam; j++) {
            System.out.print(vect[j]+num +" ");
        }
    }
}
