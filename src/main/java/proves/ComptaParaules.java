package proves;

import java.util.Scanner;

public class ComptaParaules {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();
        for (int i = 0; i < casos; i++) {

            String[] paraules = null;
            String frase = entrada.skip("[\n\r]*").nextLine().trim();
            if(frase != ""){
                frase = frase.replaceAll("\\s+", " ");
                paraules = frase.split(" ");
                System.out.println(paraules.length);
            }else System.out.println(0);

        }
    }
}
