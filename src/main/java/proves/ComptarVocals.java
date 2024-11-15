package proves;

import java.util.Scanner;

public class ComptarVocals {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();
        for (int i = 0; i < casos; i++) {
            String frase = entrada.skip("[\n\r]*").nextLine();
            frase = frase.toLowerCase();
            int a = 0, e = 0, ii = 0, o = 0, u = 0;
            for (int j = 0; j < frase.length(); j++) {
                if(frase.charAt(j) == 'a')a++;
                else if (frase.charAt(j) == 'e')e++;
                else if (frase.charAt(j) == 'i')ii++;
                else if (frase.charAt(j) == 'o')o++;
                else if (frase.charAt(j) == 'u')u++;
            }
            System.out.println("A: "+a+" E: "+e+" I: "+ii+" O: "+o+" U: "+u);
        }
    }
}
