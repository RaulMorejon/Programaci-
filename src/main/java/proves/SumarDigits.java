package proves;

import java.util.Scanner;

public class SumarDigits {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();
        int suma = 0;
        for (int i = 0; i < casos; i++) {
            int num = entrada.nextInt();
            String numeroStr = String.valueOf(num);
            for (int j = 0; j < numeroStr.length(); j++) {
                suma += Integer.parseInt(String.valueOf(numeroStr.charAt(j)));
            }
            System.out.println(suma);
        }
    }
}
