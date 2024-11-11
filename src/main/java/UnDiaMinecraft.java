import java.util.Scanner;

public class UnDiaMinecraft {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int casos = entrada.nextInt();

        for (int i = 0; i < casos; i++) {
            int numPas = entrada.nextInt(), comptador = 0;
            for (int j = 0; j < numPas; j++) {
                String lineaDiamants = entrada.skip("[\n\r]*").nextLine();
                int index = 0;
                do {
                    index = lineaDiamants.indexOf("{}",index); //-1 si no esta, o posicon donde esta
                    if (index == -1) break;
                    else{
                        index+=2;
                        comptador+=1;
                    }

                }while(true);
            }
            System.out.println(comptador);
        }
    }
}
