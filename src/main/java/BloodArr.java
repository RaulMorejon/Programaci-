import java.util.Scanner;

public class BloodArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        for (int i = 0; i < cases; i++) {

            int n = input.nextInt();
            int array [] = new int[n];
            boolean trobat = false;
            for (int j = 0; j < array.length; j++) array[j] = input.nextInt();
            for (int j = 0; j < array.length-1; j++) {
                if(array[j]==array[j+1]) {
                    trobat = true;
                    break;
                }
            }
            System.out.println(trobat ? "SI":"NO");
        }
    }
}
