package proves;

import java.util.Scanner;

public class ButlletiNotes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nota = entrada.nextInt();

        if (nota>=0 && nota<=4) System.out.println("Suspes");
        else if (nota==5 || nota==6) System.out.println("Aprovat");
        else if (nota==7 || nota==8) System.out.println("Notable");
        else System.out.println("Excelent");
    }
}
