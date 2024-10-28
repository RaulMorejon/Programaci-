package Reptes;
import java.util.Scanner;

public class OperadorRealcio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        long numero1 = 0, numero2 = 0;
        char sortida = 0;

        numero1 = entrada.nextLong();
        numero2 = entrada.nextLong();

        if (numero1 > numero2) sortida = '>';
        else if (numero1 < numero2) sortida = '<';
        else if (numero1 == numero2) sortida = '=';

        System.out.println(sortida);
    }
}
