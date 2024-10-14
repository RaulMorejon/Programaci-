import java.util.Scanner;

public class aire_acondicionat {

    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);
        int inclinacio = entrada.nextInt();

        System.out.println( inclinacio%180 == 0 ?"OK":"BRONCA");
    }

}
