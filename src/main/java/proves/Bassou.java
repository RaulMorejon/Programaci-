package proves;

import java.util.Scanner;

public class Bassou {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();
        int cantidad = 0;
        String [] alumnes = new String[casos];
        for (int i = 0; i < casos; i++) {
            alumnes[i] = entrada.skip("[\n\r]*").nextLine();
            if (alumnes[i].equalsIgnoreCase("Bassou")){
                cantidad++;
            }
        }
        System.out.print("[");
        for (int i = 0; i < casos; i++) {
            if (alumnes[i].equalsIgnoreCase("Bassou")){
                System.out.print("Bassou");
            }
            if (cantidad>1) System.out.print(", ");

        }
        System.out.print("]");

    }
}
