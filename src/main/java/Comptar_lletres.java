import java.util.Scanner;

public class Comptar_lletres {
    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriu una frase en minuscules sense carácters especials ni numeros");
        String frase = entrada.nextLine();

        int i = 0, cont_vocals = 0, cont_cons = 0, espai = 0;

        while(i<frase.length()){
            char lletra = frase.charAt(i);
            if(lletra == 'a' || lletra == 'e'|| lletra == 'i'|| lletra == 'o'|| lletra == 'u')  cont_vocals++;
            else if (lletra == ' ') espai++;
            else cont_cons++;
            i++;
        }
        System.out.println("Hi han "+cont_vocals+" vocals i "+cont_cons+" consonants i "+espai+" espais.");
    }
}
