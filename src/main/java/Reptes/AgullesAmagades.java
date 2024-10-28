package Reptes;
import java.util.Scanner;

public class AgullesAmagades {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String horaSeparada [] = entrada.nextLine().split(":");

        int hores = Integer.parseInt(horaSeparada[0]), minuts = Integer.parseInt(horaSeparada[1]), i = 1, min = 5;
        boolean ok = false;

        while (!ok && i<=12){
            if (min == 60) min = 0;
            if (hores == i && minuts == min) ok = true;
            min+=5;
            i++;
        }
        System.out.println(ok ? "SI":"NO");
    }
}
