package proves;

public class split {
    public static void main(String[] args) {

        String cadena = "hola me llamo x";
        String palabra [] = cadena.split(" ");
        for (int i = 0; i < palabra.length; i++) {
            System.out.println("Palabra de la posición "+i+": "+palabra[i]+" ");
        }

    }
}
