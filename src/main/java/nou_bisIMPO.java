import java.util.*;

public class nou_bisIMPO {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random r = new Random();
        int num = 0;
        int[] comptador = new int['Z'+'A'+1];
        char[] entrada_char; //vector on es guardara la entrada

        do{
            System.out.println("Introdueix un enter positiu: ");
            num = entrada.nextInt();
            if(num<=0) System.out.println("Introdueix un numero mes gran de 0");
        }while(num<=0);
        entrada_char = new char[num];
        System.out.println("Lletres: ");
        for (int i = 0; i < num; i++) {
            int lletra = (r.nextInt('Z'-'A'+1)+'A');
            System.out.printf("%c", lletra);
            comptador[lletra-'A']++;
            entrada_char[i] = (char)lletra;
        }
        System.out.println();
        for (int i = 0; i <entrada_char.length ; i++) {
            if (comptador[entrada_char[i]-'A'] != -1){
                System.out.printf("Vegades de la lletra %c: %d%n", entrada_char[i] , comptador[entrada_char[i]-'A']);
                comptador[entrada_char[i]-'A'] = -1;
            }
        }
    }
}
