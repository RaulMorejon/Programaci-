package Reptes;

import java.util.Scanner;

public class Bombo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int alumnes = entrada.nextInt(), bombons = entrada.nextInt();

        if (alumnes == 0 && bombons == 0) System.out.println("KO: 0");
        else if (alumnes == bombons) System.out.println("OK");
        else System.out.println( alumnes>bombons ? "KO: "+(alumnes-bombons):"OK: "+(bombons-alumnes));
    }
}
