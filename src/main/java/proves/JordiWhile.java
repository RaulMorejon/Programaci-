package proves;

import java.util.Scanner;

public class JordiWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = entrada.nextInt();
        int videos = 0, str = 0;
        while(true){
            if(num == -1) str++;
            else videos++;
            if (str == 3) break;
            num = entrada.nextInt();
        }
        System.out.println(videos);

    }
}
