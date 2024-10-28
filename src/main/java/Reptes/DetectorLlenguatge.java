package Reptes;

import java.util.Scanner;

public class DetectorLlenguatge {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String frase = entrada.nextLine();
        String codi = "";

        if (frase.equalsIgnoreCase("ADIOS")) codi = "ES";
        else if (frase.equalsIgnoreCase("GOOD BYE")) codi = "UK";
        else if (frase.equalsIgnoreCase("AU REVOIR")) codi = "FR";
        else if (frase.equalsIgnoreCase("CIAO")) codi = "IT";
        else if (frase.equalsIgnoreCase("DOEI")) codi = "NL";
        else if (frase.equalsIgnoreCase("TSCHUSS")) codi = "DE";
        else codi = "??";
        System.out.println(codi);
    }
}
