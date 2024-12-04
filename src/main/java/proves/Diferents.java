package proves;

import java.util.Scanner;

public class Diferents {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();
        for (int i = 0; i < casos; i++) {
            int tam = entrada.nextInt();
            int[] array = new int[tam];
            int[] array2 = new int[tam];
            for (int j = 0; j < tam; j++) {
                array[j] = entrada.nextInt();
            }
            for (int j = 0; j < tam; j++) {
                array2[j] = entrada.nextInt();
            }
            boolean trobat = false;
            for (int x = 0; x < tam; x++) {
                if(array[x] == array2[x]) {
                    trobat = true;
                    break;
                }
            }
            System.out.println(trobat? "NO":"SI");
        }
    }
}
