import java.util.Scanner;

public class Fisic {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int casos = 0;

        casos = entrada.nextInt();

        for (int i = 0; i < casos; i++) {
            char opcio = entrada.next().charAt(0);
            entrada.nextLine();
            String paraules = entrada.skip("[\n\r]*").nextLine();

            switch (opcio){
                case 'P':
                    String resultat1 [] = paraules.split(" ");
                    for (int j = 0; j < resultat1.length; j++) {
                        System.out.print(resultat1[j].toUpperCase().charAt(0)+resultat1[j].toLowerCase().substring(1));
                    }
                    break;
                case 'K': System.out.println(paraules.toLowerCase().replace(" ","-"));
                    break;
                case 'S': System.out.println(paraules.toLowerCase().replace(" ","_"));
                    break;
                case 'C':
                    String resultat [] = paraules.split(" ");
                    System.out.print(resultat[0].toLowerCase());
                    for (int j = 1; j < resultat.length; j++) {
                        System.out.print(resultat[j].toUpperCase().charAt(0)+resultat[j].toLowerCase().substring(1));
                    }
                    break;
            }
            System.out.println("");
        }
    }
}
