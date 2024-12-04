import java.util.Random;
import java.util.Scanner;

public class GeneraLletres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random r = new Random();
        System.out.println(r.nextInt((8+1)-5)+5);//el 1 para que el rango llegue al 8 tambien
        System.out.format("%c",r.nextInt(('z'+1)-'a')+'a'); //letras aleatorias en minuscula, se le suma 'a' para posicionarlo a la altura del rango en ascii seria lo mismo con numeros
    }
}
