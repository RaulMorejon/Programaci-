import java.util.Scanner;

public class UnaDeCada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int linies = 0;

        do {
            linies = entrada.nextInt();
        }while (linies < 0 || linies >= 1000);
        entrada.nextLine();

        for (int i = 0; i < linies; i++) {
            String frase = entrada.nextLine();
            for (int j = 0; j < frase.length(); j++) {
                if (j %2 == 0) System.out.print(frase.toLowerCase().charAt(j));
                else System.out.print(frase.toUpperCase().charAt(j));
            }
            System.out.println(" ");
        }
    }
}

