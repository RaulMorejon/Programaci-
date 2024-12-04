package proves;

import java.util.Scanner;

public class Eleccions {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            int tam = entrada.nextInt();
            for (int i = 0; i < tam; i++) {
                for (int j = 0; j < tam; j++) {
                    if (i==j || (i+j==tam-1) || i==0 || i==tam-1 || j==0 || j==tam-1)  System.out.print("X ");//i+j==tam-1 para escribir la otra diagonal contraria
                    else System.out.print(". ");
                }
                System.out.println();
            }
        }
}

