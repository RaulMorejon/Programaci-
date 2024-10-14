import java.util.Scanner;

public class Interval_numeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1 = entrada.nextInt(), n2 = entrada.nextInt(), i = n1;

        if(n2<=n1){
            while (i>=n2){
                System.out.println(i);
                i--;
            }
        } else System.out.println("El segon numero no es mes petit que el primer");

    }
}
