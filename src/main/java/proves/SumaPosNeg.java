package proves;

import java.util.Scanner;

public class SumaPosNeg {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, pos = 0, neg = 0;
        do{
            num = entrada.nextInt();
            if(num > 0) pos++;
            else if (num < 0)neg++;
        }while(num!=0);
        if(pos==neg) System.out.println("IGUALS");
        else System.out.println(pos>neg ? "POSITIUS":"NEGATIUS");
    }
}
