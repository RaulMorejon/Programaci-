package proves;

import java.util.Scanner;

public class NoPatata {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();
        for (int i = 0; i < casos; i++) {
            String frase = entrada.skip("[\n\r]*").nextLine();
            System.out.println(frase.equalsIgnoreCase("patata")? "Es Patata":"No es Patata");
        }
    }
}
