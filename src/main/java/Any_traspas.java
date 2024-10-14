import java.util.Scanner;

public class Any_traspas {

    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);
        int any = entrada.nextInt();
        System.out.println( any%4==0 && any%100!=0 || any%4==0 && any%400==0 ? "SI": "NO");
    }

}
