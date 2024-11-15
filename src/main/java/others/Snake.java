package others;

import java.util.Scanner;

public class Snake {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce las filas y las columnas: ");
        int filas = entrada.nextInt(), columnas = entrada.nextInt();
        String[][] tablero = new String[filas][columnas];
        Tablero miTablero = new Tablero();
        miTablero.CreaTableroInicio(filas,columnas,tablero);
        for (int i = 0; i < 5; i++) {
            miTablero.GuardaManzana(filas,columnas,tablero);
        }
        miTablero.MuestraTableroInicio(filas,columnas,tablero);
    }
}
class Tablero {
    public String[][] CreaTableroInicio(int filas, int columnas, String tablero[][]){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = "X";
            }
        }
        return tablero;
    }
    public void MuestraTableroInicio(int filas, int columnas, String[][]tablero){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public void GuardaManzana(int fila, int columna, String tablero[][]){
        int filaManzana = (int)(Math.random() * fila-1);
        int columnaManzana = (int)(Math.random() * columna-1);
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if(i==filaManzana && j==columnaManzana) tablero[i][j] = "&";
            }
        }
    }

}
