
import java.util.Scanner;

public class Cercar_p_t {

    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introdueix els 3 numeros:");
        int n1 = entrada.nextInt(), n2 = entrada.nextInt(), n3 = entrada.nextInt();

        if ((n1==n2 && n2!=n3 && n3!=0)||(n2==n3 && n2!=n1 && n1!=0)||(n1==n3 && n1!=n2 && n2!=0))  System.out.println("PARELLA");

        else if ((n1==n2 && n2==n3)||(n1==n2 && n3==0)||(n2==n3 && n1==0)||(n1==n3 && n2==0)) System.out.println("TRIO");

        else System.out.println(n1==0||n2==0||n3==0 ? "PARELLA":"RES");
    }
}

