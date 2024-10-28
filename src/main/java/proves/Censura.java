package proves;
import java.util.Scanner;

public class Censura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int casos = entrada.nextInt();

        for (int i = 0; i < casos; i++) {
            int linies = entrada.nextInt();
            String censura [] = new String[linies-1];
            String frase = "";
            for (int j = 0; j < linies; j++) {
                frase = entrada.next();
                if (j != linies - 1) {
                    censura[j] = frase;
                }

                String frase1[] = frase.split(" ");
                for (int k = 0; k < frase1.length; k++) {
                    //for (int p = 0; p < linies-1; p++) {
                    if (frase1[k].equalsIgnoreCase(censura[k])) {
                        for (int z = 0; z < frase1[k].length(); z++) {
                            System.out.print("*");
                        }
                    } else {
                        System.out.print(" " + frase1[k] + " ");
                        //   }
                    }

                }
            }
        }

    }
}
