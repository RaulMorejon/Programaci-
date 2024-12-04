import java.util.Random;

public class LoteriaNadal {

    public static final int FILA = 5;
    public static final int COLUMNA = 5;

    public static void main(String[] args) {
        Random r = new Random();
        int[][] matriu = new int[FILA][COLUMNA];
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                System.out.printf("%d  ", matriu[i][j] = r.nextInt(10));
            }
            System.out.println();
        }
        System.out.println("////////////////");
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                int suma = 0;
                if (i == 0 || i == matriu.length-1 || j == 0 || j==matriu[i].length-1) {
                    if (i==0 && j==0) suma = matriu[i+1][j]+matriu[i+1][j+1]+matriu[i][j+1];


                }
                else {
                    suma = matriu[i-1][j-1]+matriu[i-1][j]+matriu[i-1][j+1]+matriu[i][j-1]+matriu[i][j+1]+matriu[i+1][j-1]+matriu[i+1][j]+ matriu[i+1][j+1]+matriu[i][j];
                }
                System.out.format("%3d ", suma);

            }
            System.out.println();
        }



    }
}
