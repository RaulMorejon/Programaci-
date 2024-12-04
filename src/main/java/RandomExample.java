import java.util.*;

public class RandomExample {
    public final static int NUMCARES = 6;
    public final static int TIRADES = 100;

    public static void main(String[] args) {
        Random r = new Random();
        int[] contador_cares = new int [NUMCARES];
        for (int i = 0; i < TIRADES; i++) {
            int index = r.nextInt(NUMCARES);
            contador_cares[index]++;
        }
        for (int j = 0; j < NUMCARES; j++) {
            System.out.println("Cara numero " + (j + 1) + ": " + contador_cares[j] + " vegades");
        }
    }
}
