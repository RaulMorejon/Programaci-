package proves;

import java.util.Scanner;

public class JordiWhile2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 0, n_1 = 0, n_vis = 0;

        while(true){
            num = entrada.nextInt();
            if (num == -1) n_1+=1;
            else n_vis+=num;
            if(n_1 == 3) break;
        }
        System.out.println(n_vis);
    }
}
