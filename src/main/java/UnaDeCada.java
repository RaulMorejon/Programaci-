import java.util.Scanner;

public class UnaDeCada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean minuscuala = true;
        int linies = 0;

        linies = entrada.nextInt();

        for (int i = 0; i < linies; i++) {
            String frase = entrada.skip("[\n\r]*").nextLine();
            for (int j = 0; j < frase.length(); j++) {
                if (minuscuala) System.out.print(frase.toLowerCase().charAt(j));
                else System.out.print(frase.toUpperCase().charAt(j));
                minuscuala = !minuscuala;
            }
            System.out.println("");
        }
    }
}

