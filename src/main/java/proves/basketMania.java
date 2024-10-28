package proves;

import java.util.Scanner;

public class basketMania {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int casos = entrada.nextInt();
        for (int i = 0; i < casos; i++) {
            int linies = 0;
            int l_acum = 0, v_acum = 0;
            linies = entrada.nextInt();
            for (int j = 0; j < linies; j++) {
                String cistella = entrada.next();
                int punts = entrada.nextInt();
                if (cistella.equalsIgnoreCase("L")) l_acum+=punts;
                else if (cistella.equalsIgnoreCase("V")) v_acum+=punts;
            }
            if (l_acum == v_acum) System.out.println("E "+l_acum+" "+v_acum);
            else System.out.println( l_acum > v_acum ? "L "+l_acum+" "+v_acum: "V "+l_acum+" "+v_acum);
        }

    }
}
