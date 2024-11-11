import java.util.Scanner;

public class Bloodborne {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos  = entrada.nextInt();

        for (int i = 0; i < casos; i++) {
            String paraula = entrada.skip("[\n\r]*").nextLine().toLowerCase();
            boolean trobat = false;
            for (int j = 0; j < paraula.length()-1; j++) {
                if(paraula.charAt(j)==paraula.charAt(j+1)) {
                    trobat = true;
                    break;
                }
            }
            System.out.println(trobat ? "SI":"NO");
        }
    }
}
