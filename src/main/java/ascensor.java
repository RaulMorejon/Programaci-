import java.util.Scanner;

public class ascensor {
    public static void main(String[] args) {

        //variables entrada
        Scanner entrada = new Scanner(System.in);
        int pis_min = entrada.nextInt();
        int pis_max = entrada.nextInt();
        int pis_ini = entrada.nextInt();
        boolean seguir = true;
        //variables sortida
        int n_moviments = 0;
        int pisos_totals = 0;
        int pis_final = pis_ini;
        boolean error = false;

        do {
            String opcions = entrada.next();//amb nextLine el programa donara error
            if(opcions.equalsIgnoreCase("X")) seguir = false; //sortim del bucle
            else {
                int pis = Integer.valueOf(opcions);
                if(pis<pis_min || pis>pis_max) error = true;//pis incorrecte
                // pis correcte
                else{
                    if(pis != pis_final){//mirem si cambia de pis
                        n_moviments++;
                        if (pis>pis_final) pisos_totals += pis-pis_final; //numero de pisos que ens movem
                        else pisos_totals += pis_final-pis;
                        //actualitzem el pis on anem
                        pis_final = pis;
                    }
                }
            }
        } while (seguir);
        //sortida amb o sense errors
        System.out.println(n_moviments+" "+pisos_totals+" "+pis_final+(error ? " E":""));
    }
}
