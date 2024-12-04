import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dimensio;
        do {
            System.out.println("Introdueix un valor major o igual a 1");
            dimensio = entrada.nextInt();
        }while(dimensio<1);
        char lletra = 'A';
        char[][] matriu = new char[dimensio][dimensio];
        for (int i = 0; i < dimensio; i++) {
            for (int j = 0; j < dimensio; j++) {
                matriu[i][j] = lletra;
                if (lletra=='Z') lletra = 'A';
                else lletra++;
            }
        }
        for (int i = 0; i < dimensio; i++) {
            for (int j = 0; j < dimensio; j++) {
                System.out.print(matriu[i][j]+"  ");
            }
            System.out.println("");
        }
    }
}
