package proves;

import java.util.Scanner;

public class AnimalsJordina {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();
        for (int i = 0; i < casos; i++) {
            int lin = entrada.nextInt();
            String animal = entrada.nextLine();
            boolean trobat = false;
            for (int j = 0; j < (lin-1); j++) {
                String nou_an = entrada.skip("[\n\r]*").nextLine();
                if(nou_an.equalsIgnoreCase(animal)){
                    trobat = true;
                    break;
                }
            }
            System.out.println(trobat ? "SI":"NO");
        }
    }
}
