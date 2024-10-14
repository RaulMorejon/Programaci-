import java.util.Scanner;

public class Exclamacions {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //boolean entra = true;

        String frase = entrada.nextLine();
        /*
        if (frase.equals("FIN")||frase.equals("fin")) {
            entra = false;
        }*/
        while (!(frase.equals("FIN")||frase.equals("fin"))) {
            int i = 0;
            int ex_ini = 0, ex_fin = 0;
            while (i< frase.length()){
                if (frase.charAt(i) == '¡') ex_ini++;
                else if (frase.charAt(i) == '!') ex_fin++;
                i++;
            }
            System.out.println(ex_ini == ex_fin ? "SI":"NO");
            frase = entrada.nextLine();
            /*if (frase.equals("FIN")||frase.equals("fin")) {
                entra = false;
            }*/
        }
    }
}


