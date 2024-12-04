package proves;
import java.util.Scanner;

public class cont_notes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int notes = entrada.nextInt();
        int n_notes=0, ex=0, not=0, b=0, su=0, insu=0, def=0, suma_n =0;
        while (notes != -1){
            if(notes>=0 && notes<=10){
                n_notes++;
                suma_n+=notes;
                if(notes==9||notes==10) ex++;
                else if(notes==7||notes==8) not++;
                    else if(notes==6) b++;
                        else if(notes==5) su++;
                            else if(notes<5&&notes>3) insu++;
                                else if(notes<=3&&notes>=0) def++;
            }
            notes = entrada.nextInt();
        }
        System.out.println("NOTES: "+n_notes+" MITJANA: "+((float)suma_n/n_notes)+" E: "+ex+" N: "+not+" B: "+b+" S: "+su+" I: "+insu+" MD: "+def);
        //%.7f (decimal con 7 decimales) %n (salto de linea con el format)  EN ESTE NO USAR FORMAT PORQUE DA ERROR
    }
}
