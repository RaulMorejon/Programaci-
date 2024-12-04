package proves;
import javax.swing.*;
import java.util.Scanner;

public class PracStringIMPORTANT {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase, frase2;
        int caracters = 0;
        int cont = 0;
        System.out.println("Introdueix un text amb varies linies acabat en punt: ");
        frase = entrada.nextLine();
        if (!frase.isBlank()) cont++; //si esta buit
        caracters += frase.trim().length();
        while(!frase.contains(".")){ //si contiene acaba
            frase2 = entrada.nextLine();
            caracters += frase2.trim().length();
            if (!frase2.isBlank()) cont++;
            frase = frase.concat("\n"+frase2);
        }
        System.out.println(frase);
        System.out.println("Linies amb text: " +cont+" | Te "+caracters+" caracters");
    }
}
