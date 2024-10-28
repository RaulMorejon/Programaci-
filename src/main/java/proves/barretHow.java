package proves;
import java.util.Scanner;

public class barretHow {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String resposta = entrada.nextLine();

        if(resposta.equals("Coratge")) System.out.println("Gryffindor");
        else if (resposta.equals("Coneixement")) System.out.println("Ravenclaw");
        else System.out.println(resposta.equals("Ambicio")? "Slytherin":"Hufflepuff");

    }
}
