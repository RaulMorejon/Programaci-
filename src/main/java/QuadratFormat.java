import java.util.Locale;
import java.util.Scanner;

public class QuadratFormat {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String costat = entrada.nextLine();
        float area = Float.parseFloat(costat)*Float.parseFloat(costat);
        Locale.setDefault(Locale.US);

        System.out.format("%015.3f",area);

    }
}

