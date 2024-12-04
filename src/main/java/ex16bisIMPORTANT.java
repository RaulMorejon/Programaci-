import java.util.Random;
import java.util.Scanner;

public class ex16bisIMPORTANT {
    final static int FILA = 5;
    final static int COLUMNA = 10;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random num = new Random();

        int[][] matriu = new int[FILA][COLUMNA];


        int rango_inf, rango_sup;
        //pedir rangos de relleno
        do{
            System.out.println("Introdueix un numero igual o mes gran de 0");
            rango_inf = entrada.nextInt();
            if (rango_inf<0) System.out.println("Valor incorrecte!");
            else {
                System.out.println("Introdueix un numero mayor a "+rango_inf);
                rango_sup = entrada.nextInt();
                if (rango_sup <= rango_inf) System.out.println("Introdueix un valor mes gran que "+rango_inf);
                  else break;
            }
        }while (true);
        int x = 0;
        int [] vegades = new int[rango_sup-rango_inf+1];
        //rellenar y mostrar matriz
        System.out.println(rango_inf+" "+rango_sup);
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                matriu[i][j] = num.nextInt(rango_sup-rango_inf+1)+rango_inf;
                System.out.printf("%4d ", matriu[i][j]); //ordenar que queden alineados
                vegades[matriu[i][j]-rango_inf]++;
            }
            System.out.println("");
        }
        //mostrar veces
        for (int i = 0; i < vegades.length; i++) {
            System.out.printf("\nEl valor %d ha sortit %d vegades", i+rango_inf, vegades[i]);
        }
    }
}
