package proves;

import java.util.Scanner;

public class HarrisonFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = entrada.nextInt();


        for (int i = 1000000; i <=num; i+=1000000) {
            System.out.println(i);
        }

    }
}
