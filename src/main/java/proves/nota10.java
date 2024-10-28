package proves;

import java.util.Scanner;

public class nota10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nota = entrada.nextInt();
        int t_notes = 0, notes_10 = 0;
        while (nota!=-1){
            if(nota>=0 && nota<=10){
                t_notes++;
                if (nota == 10) notes_10++;
            }
            nota = entrada.nextInt();
        }
        System.out.println("TOTAL NOTES: "+t_notes+" NOTES10: "+notes_10);
    }
}
