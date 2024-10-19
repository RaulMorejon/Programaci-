import java.util.Scanner;

public class Lalafel {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();

        entrada.nextLine();//<- sirve para evitar el error que nos daba en clase al leer un String despues de un Int
        for (int i = 0; i < casos; i++) {

            int telaranya_acum = 0;
            int cont_lala = 0;
            int telaranya = 0;

            String frase = entrada.nextLine();
            int capacidad = entrada.nextInt();
            entrada.nextLine();// limpia
            String palabras [] = frase.split(", ");

            int j = 0;
            boolean aranya = false;
            int lalafel = 0;

            while (j<palabras.length && !aranya) {
                if (palabras[j].equalsIgnoreCase("Aranya")||capacidad <=0) {//control de numeros negativos o 0
                    telaranya = 0;
                    aranya = true;
                }
                else if (palabras[j].equalsIgnoreCase("Telaranya")) {
                    lalafel = 0;
                    telaranya_acum = 0;
                    telaranya ++;
                }else{
                    if (palabras[j].equalsIgnoreCase("Lalafel")){
                        lalafel++;
                        cont_lala++;
                    }
                    if (lalafel == capacidad){
                        telaranya_acum++;
                        lalafel = 0;
                    }
                }
                j++;
            }
            if(capacidad > cont_lala) telaranya = 0;
            System.out.println("Hay "+ telaranya +" telaranyas llenas.");
        }
    }
}
