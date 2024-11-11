package proves;

import java.util.Scanner;

public class CompteEnrere {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = entrada.nextInt();

        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
