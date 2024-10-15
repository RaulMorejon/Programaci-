import java.util.Scanner;

public class cebra {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int fila=0, columna=0, ini=0;

        fila = entrada.nextInt();
        columna = entrada.nextInt();
        ini = entrada.nextInt();

        for(int i=0; i<fila; i++){
            for(int j=0; j<columna; j++){
                if(ini%2==0)System.out.print("1 "); //si empieza en par, empezamos con 1s
                else System.out.print("0 ");
            }
            System.out.println(" ");
            ini++;//turnamos entre 1 y 0
        }
    }
}
