package practicas;
import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.println("Indrodueix un numero enter:");
            numero = entrada.nextInt();
            System.out.println(numero);
        }while(numero!=0);
        System.out.println("Programa finalitzat");
    }
}
