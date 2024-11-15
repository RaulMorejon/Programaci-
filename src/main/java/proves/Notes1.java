package proves;

import java.util.Scanner;

public class Notes1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();
        for (int i = 0; i < casos; i++) {
            int alumnes = entrada.nextInt(), moduls = entrada.nextInt();
            int num = 0, suma = 0;
            for (int y = 0;y < alumnes; y++) {
                for (int j = 0; j < moduls; j++) {
                    num = entrada.nextInt();
                    suma = suma + num;
                }
            }
            int mitges = suma / (alumnes*moduls);
            System.out.println(mitges);



        }

    }
}
