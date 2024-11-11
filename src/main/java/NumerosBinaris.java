import java.util.Scanner;

public class NumerosBinaris {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int casos = entrada.nextInt();

        for (int i = 0; i < casos; i++) {

            String operacio [] = entrada.skip("[\n\r]*").nextLine().trim().split(" ");
            int n1 = Integer.parseInt(operacio[0]), n2 = Integer.parseInt(operacio[2]), numero = 0;

            if (operacio[1].equals("+")) numero = n1 +n2;
            else if (operacio[1].equals("-")) numero = n1 - n2;

            String resultat = "";

            if (numero==0) System.out.println("0");
            else{
                while (numero !=0){

                    resultat = (numero %2) + resultat;
                    numero = numero /2;
                }
                System.out.println(resultat);
            }

        }
    }
}
