package proves;

import java.util.Scanner;

public class OkBoomer {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int any = entrada.nextInt();

        System.out.println(any>=1945 && any<=1965 ? "ok boomer":"nah");

    }
}
