package others;
import javax.swing.*;

public class metode {
    public static void main(String[] args) {
        AdminTasques AdminTasques = new AdminTasques();
        String llista_tasca []= new String[100];

        boolean exit = false;
        while (!exit){
            int opcio = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n1. LListar tasca\n2. Eliminar tasca\n5.Crear tasca\n6. Sortir"));
            switch (opcio){
                case 1: AdminTasques.llistar_tasca(llista_tasca);
                    break;
                case 2:
                    break;
                case 5: AdminTasques.crear_tasca();
                    break;
                case 6: exit = true;
                    break;
            }
        }


    }
}

class AdminTasques{

    String llista_tasca []= new String[5];
    int i = 0;
     public void llistar_tasca(String llista_tasca[]){


     }
    public void crear_tasca(){
         String nom = JOptionPane.showInputDialog("Introdueix el nom de la tasca: ");
         Tasca tasca = new Tasca(nom);
         llista_tasca[i] = tasca.mostrar_des();
         i++;
    }
     public void elimar_tasca(){
         System.out.println("Tasca elimada amb exit");
     }
    public void completar_tasca(){

    }
    public void modificar_tasca(){

    }
    public void sortir(){
    }
}

class Tasca{
    private String descripcio = "";
    public Tasca(String nom){
        this.descripcio = nom;
    }
    public String mostrar_des(){
        return descripcio;
    }
}