import java.util.Scanner;

public class cebra {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int fila=0, columna=0, ini=0;

        fila = entrada.nextInt();
        columna = entrada.nextInt();
        ini = entrada.nextInt();

        for(int i=0; i<fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(ini % 2 == 0 ? "1 " :"0 ");//si empieza en par, empezamos con 1s
            }
            System.out.println(" ");
            ini++;//turnamos entre 1 y 0
        }
    }
}
