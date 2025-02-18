package gui;

import com.iesebre.usefulcode.DirectAccessFile;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import static gui.FinestraPrincipal.obtenirFitxer;

//- Registrar usuario
//        - Nombre y apellido
//        - Fecha de nacimiento
//        - Pais de nacimiento

public class FinestraRegistrat extends JFrame{
    private JPanel panellRegistrat;
    private JLabel Registre;
    private JTextField nom;
    private JLabel textNom;
    private JTextField cognoms;
    private JLabel textCognoms;
    private JLabel textNacionalitat;
    private JComboBox comboBoxDia;
    private JComboBox comboBoxMes;
    private JComboBox comboBoxAny;
    private JLabel naixement;
    private JTextField nacionalitat;
    private JButton botoRegistrar;
    private JButton paginaPrincipalButton;
    private JButton botoPaginaPrincipal;
    private  FinestraLlista llistaUsr;
    private static DirectAccessFile<Pojo> dafModificat; //



    public FinestraRegistrat (FinestraLlista llista) throws IOException, ClassNotFoundException {
        this.setContentPane(panellRegistrat); //Per poder visualitzar la finestra
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Tanca per complet quan li dones a la creu
        this.pack(); //empaquetar
        this.setLocationRelativeTo(null); //que es vegui al centre
        this.setVisible(true); //Finestra visible
        this.setTitle("Registrat - Trivial");
        this.setSize(1300, 900);
        this.setResizable(false);
        this.llistaUsr = llista;

        //fitxer dades usuari
        dafModificat = obtenirFitxer();
        if (dafModificat==null) System.out.println("Fitxer null en Registrar");

        //DATA NAIXEMENT - Emplenar tots els Combo box - i posar valors per defecte
        for (int i = 1; i <= 31; i++) comboBoxDia.addItem(String.valueOf(i));//Afegir dies
        String[] mesos = {"Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre"};
        for (int i=0; i<mesos.length;i++) comboBoxMes.addItem(mesos[i]);
        for (int i = 2025; i >= 1900; i--) comboBoxAny.addItem(String.valueOf(i)); //Afegir anys
        comboBoxAny.setSelectedItem("2000");

        //Listeners
        botoRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //afegir les dades a la llista
                int edat = 2025-(Integer.parseInt((String)comboBoxAny.getSelectedItem()));
                int partidesJugades = 5, partidesGuanyades = 6, preguntesAcertades = 7;

                if (!nom.getText().isBlank() && !cognoms.getText().isBlank() && !nacionalitat.getText().isBlank()){
                    try {
                        //guarda al fitxer
                        dafModificat.writeObject(new Pojo(nom.getText().strip(),cognoms.getText().strip(), edat, nacionalitat.getText().strip(),partidesJugades, partidesGuanyades, preguntesAcertades));
                        //Posteriorment guardara a la taula
                        Pojo usr = new Pojo(nom.getText().strip(), cognoms.getText().strip(), edat, nacionalitat.getText().strip(), partidesJugades, partidesGuanyades, preguntesAcertades);

                        if(llistaUsr.nomComplertRepetit(nom.getText(),cognoms.getText())) JOptionPane.showMessageDialog(null,"Usuari ja existent");
                        else{
                            llistaUsr.afegirDades(usr);//Guarda a la taula
                            JOptionPane.showMessageDialog(null,"Usuari Registrat Correctaments");
                        }
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    nom.setText("");
                    cognoms.setText("");
                    nacionalitat.setText("");
                    comboBoxMes.setSelectedItem("Gener");
                    comboBoxDia.setSelectedItem("1");
                    comboBoxAny.setSelectedItem("2000");

                }else JOptionPane.showMessageDialog(null, "Completa tots els camps");
            }
        });


        botoPaginaPrincipal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {//tancar el fitxer quan es tanqui la finestra
                super.windowClosing(e);
                try {
                    dafModificat.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Hi ha un problema per tancar el programa");
                }
            }
        });


    }
    public static DirectAccessFile obtenirFitxerModificat(){
        return dafModificat;
    }




}
