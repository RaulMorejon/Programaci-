package proves;

    import java.util.Scanner;

    public class BolasLobas {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            int casos = entrada.nextInt();
            for (int i = 0; i < casos; i++) {
                String paraula = entrada.skip("[\n\r]*").nextLine();
                int p1 = entrada.nextInt(), p2 = entrada.nextInt();
                for (int j = 0; j < paraula.length()-1; j++) {
                    if(i!=p1 && i!=p2) System.out.printf("%c", paraula.charAt(i));
                    else if (i==p1) System.out.printf("%c",paraula.charAt(p2));
                    else System.out.printf("%c", paraula.charAt(p1));
                }
                System.out.println();
            }
        }
    }
