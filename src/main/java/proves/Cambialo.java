package proves;
import java.util.Scanner;

public class Cambialo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();
        for (int i = 0; i < casos; i++) {

            int tam = entrada.nextInt();
            int num [] = new int[tam];
            for (int i1 = 0; i1 < tam; i1++) {
                num[i1] = entrada.nextInt();
            }
            int p1 = entrada.nextInt(), p2 = entrada.nextInt();

            for (int j = 0; j < tam; j++) {
                if (num[j] == p1){
                    num[j] = p2;
                    System.out.print(num[j]+" ");
                }else System.out.print(num[j]+" ");
            }
            System.out.println();
        }
    }
}
