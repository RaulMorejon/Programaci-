package proves;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int casos = entrada.nextInt();
        entrada.nextLine(); //consumir antes de leer string
        for (int i = 0; i < casos; i++) {
            int resultat = 0;
            String operacio [] = entrada.nextLine().trim().split(" "); //trim para eliminar espacios
            if (operacio[1].equals("+")){
                resultat = Integer.parseInt(operacio[0])+Integer.parseInt(operacio[2]);
            } else if (operacio[1].equals("-")){
                resultat = Integer.parseInt(operacio[0])-Integer.parseInt(operacio[2]);
            }else if (operacio[1].equals("*")){
                resultat = Integer.parseInt(operacio[0])*Integer.parseInt(operacio[2]);
            } else if (operacio[1].equals("/")) {
                resultat = Integer.parseInt(operacio[0])/Integer.parseInt(operacio[2]);
            }
            System.out.println(resultat);
        }
    }
}
