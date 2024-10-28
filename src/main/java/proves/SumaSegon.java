package proves;

import java.util.Scanner;

public class SumaSegon {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int h = entrada.nextInt(), m = entrada.nextInt(), s = entrada.nextInt();
        s++;
        if(s>=60){
            s = s-60;
            m++;
        }
        if(m==60){
            m = 0;
            h++;
        }
        if(h==24) h = 0;
        System.out.println(h+" "+m+" "+s);
    }
}
