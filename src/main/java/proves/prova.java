package proves;
import java.util.Scanner;

public class prova {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int cont = 0;
        System.out.println("Introdueix una frase (escriure Fi per acabar)");
        do{
          String frase = ent.nextLine().toUpperCase();
          if (frase.isEmpty()) continue;//empty es una cadena sense caracters, Blank detecta los espcios vacios como caracteres
          else if(frase.equals("FI")) break;
          else if(frase.charAt(0) !='A') continue;//va fuera y no incrementa el contador. pero no es un break que sale del bucle
            cont++;
        }while(true);
        System.out.format("exit, resultat: Hi ha %d A ",cont);
    }
}
