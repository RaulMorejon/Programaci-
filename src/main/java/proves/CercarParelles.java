package proves;

import java.util.Scanner;

public class CercarParelles {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int c1 = entrada.nextInt(), c2 = entrada.nextInt(), c3 = entrada.nextInt();
        System.out.println(c1 == c2 || c1 == c3 || c2 == c3 ? "SI":"NO");
    }
}