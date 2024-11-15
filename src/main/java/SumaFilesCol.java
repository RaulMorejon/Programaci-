import java.util.Scanner;

public class SumaFilesCol {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int fila = entrada.nextInt(), columna = entrada.nextInt();
        int[][] matriu = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriu[i][j] = entrada.nextInt();
            }
        }
        int pos = entrada.nextInt(), suma_fil = 0;
        for (int i = 0; i < fila; i++) {
            suma_fil = suma_fil + matriu[i][pos];
        }
        int suma_col = 0;
        for (int i = 0; i < columna; i++) {
            suma_col = suma_col + matriu[pos][i];
        }
        System.out.println(suma_col+" "+suma_fil);

    }
}
