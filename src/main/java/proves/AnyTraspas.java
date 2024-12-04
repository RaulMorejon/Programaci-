package proves;

import java.util.Scanner;

public class AnyTraspas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = entrada.nextInt();

        if (num%4==0){
            if (num%100==0){
                if (num%400==0) System.out.println("SI");
                else System.out.println("NO");
            }else System.out.println("SI");
        }
        else System.out.println("NO");
    }
}
