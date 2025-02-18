package gui;

import com.iesebre.usefulcode.DirectAccessFile;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

/*
IMPLEMENTACIÓNS PENDENTS:

    - No deixar modificar un usuari i posar un nom que ja existeix
*/
public class FinestraLlista extends JFrame {

    private JPanel panellLlista;
    private JTable llistaUsuaris;
    private JLabel llistat;
    private JButton botoEliminar;
    private JButton botoModificar;
    private JTextField nacionalitat;
    private JTextField cognoms;
    private JTextField nom;
    private JComboBox comboBoxEdat;
    private JButton botoPaginaPrincipal;
    private JScrollPane taula;
    private DefaultTableModel dtm;
    private static DirectAccessFile<Pojo> dafInsertar;


    public FinestraLlista() throws IOException, ClassNotFoundException {
        this.setContentPane(panellLlista); //Per poder visualitzar la finestra
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Tanca per complet quan li dones a la creu
        this.pack(); //empaquetar
        this.setLocationRelativeTo(null); //que es vegui al centre
        this.setVisible(true); //Finestra visible
        this.setTitle("Listat d'Usuaris - Trivial");
        this.setSize(1300, 900);
        this.setResizable(false);
        if (dafInsertar==null){
            dafInsertar = new DirectAccessFile<>("dadesUsuaris.dat");
        }
        for (int i = 4; i <= 100; i++) comboBoxEdat.addItem(String.valueOf(i));//Completa el combobox de l'edat

        dafInsertar = new DirectAccessFile<>("dadesUsuaris.dat");//Inicialitcem fitxer
        Object[][] dades = new Object[dafInsertar.size()][7];//2 columnes i calculem les files que hi han al fitxer
        //Guarda correctament al fitxer les dades
        for (int i = 0; i < dafInsertar.size(); i++) {
            Pojo p = dafInsertar.readObject(i);//llegueix els objectes de cada posició
            //Guardem les dades en la matriu
            dades[i][0] = p.getNom();
            dades[i][1] = p.getCognoms();
            dades [i][2] = p.getEdat();
            dades [i][3] = p.getNacionalitat();
            dades [i][4] = p.getPartidesJugades();
            dades [i][5] = p.getPartidesGuanyades();
            dades [i][6] = p.getPreguntesAcertades();
        }



        dtm = new DefaultTableModel(
                //Dades a mostrar
                dades,
                //Columnes de la tala
                new Object[]{"Nom","Cognoms","Edat","Pais de Naixement","NºPartides Guanyades","NºPartides jugades","NºPreguntes Acertades"}
        );
        llistaUsuaris.setModel(dtm); //Asignem el model a la taula
        llistaUsuaris.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //Seleccio de la taula de manera que nomes es pugui seleccionar una fila (per seguretat)


        botoEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSel = llistaUsuaris.getSelectedRow(); //retorna numero de fila, si no hi ha cap retorna -1
                if(filaSel!=-1){
                    try {
                        dafInsertar.deleteObject(filaSel);
                        dtm.removeRow(filaSel);//Borra la fila seleccionada
                    }catch (IOException | ClassNotFoundException ex){
                        JOptionPane.showMessageDialog(null, "Eliminat Correctament");
                    }
                }
                else JOptionPane.showMessageDialog(null, "Has de seleccionar una fila per borrar-la");
            }
        });

        botoModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSel = llistaUsuaris.getSelectedRow(); //retorna numero de fila, si no hi ha cap retorna -1
                if(filaSel!=-1){
                    if ((!nom.getText().isBlank()&&!cognoms.getText().isBlank()&&!nacionalitat.getText().isBlank())){
                        //Obte els camps de la taula
                        int nGuanyades = llistaUsuaris.getColumnModel().getColumnIndex("NºPartides Guanyades")+1;
                        int nJugades = llistaUsuaris.getColumnModel().getColumnIndex("NºPartides jugades")+1;
                        int nAcertades = llistaUsuaris.getColumnModel().getColumnIndex("NºPreguntes Acertades")+1;

                        //Guarda al pojo les dades completes
                        Pojo usr_nou = new Pojo(nom.getText().strip(), cognoms.getText().strip(),comboBoxEdat.getSelectedIndex()+4, nacionalitat.getText().strip(),nGuanyades, nJugades, nAcertades);
                        //Primer borrem la fila seleccionada
                        try {
                            dafInsertar.deleteObject(filaSel);
                            dtm.removeRow(filaSel);
                        } catch (IOException | ClassNotFoundException ex) {
                            JOptionPane.showMessageDialog(null,"Error: Hi ha un problema per modificar la linea (No elimina)");
                        }
                        //Modificar dades
                        try {
                            afegirDades(usr_nou);//metode per guardar al fitxer
                            modificarDades(usr_nou, filaSel);//metode per guardar a la taula

                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(null, "Error: Hi ha un problema per modificar la linea (No Inserta)");
                        }
                        JOptionPane.showMessageDialog(null, "Usuari Modificat Correctament");
                        //posa les entrades de baix del programa en blanc
                        nom.setText("");
                        cognoms.setText("");
                        nacionalitat.setText("");
                        comboBoxEdat.setSelectedItem("4");
                    }else JOptionPane.showMessageDialog(null,"Els camps no poden ser blancs");

                } else JOptionPane.showMessageDialog(null, "Has de seleccionar la fila a modificar");
            }
        });

        botoPaginaPrincipal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        //que se quede la edad cuando seleccione la fila
        comboBoxEdat.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

            }
        });
    }


    /**
     * Afegeix les dades d'un usuari nou al llistat d'usuaris al fitxer
     * @param usuari Tipus Pojo
     */
    public void afegirDades (Pojo usuari) throws IOException {
        dafInsertar.writeObject(new Pojo(
                usuari.getNom().strip(),
                usuari.getCognoms().strip(),
                usuari.getEdat(),
                usuari.getNacionalitat().strip(),
                usuari.getPartidesGuanyades(),
                usuari.getPartidesJugades(),
                usuari.getPreguntesAcertades()
        ));
    }

    /**
     * Modifica les dades d'un usuari de la llista d'usuaris
     * @param usuari Tipus Pojo
     * @param fila Enter amb el numero de fila de la llista
     */
    public void modificarDades (Pojo usuari, int fila){
        dtm.insertRow(fila,new Object[]{
                usuari.getNom().strip(),
                usuari.getCognoms().strip(),
                usuari.getEdat(),
                usuari.getNacionalitat().strip(),
                usuari.getPartidesGuanyades(),
                usuari.getPartidesJugades(),
                usuari.getPreguntesAcertades()
        });
    }

    /**
     * Diu si ja existeix un usuari a la llista, per evitar usuaris repetits, te en compte nom amb cognoms inclosos
     * @param nom Srting ham el nom de l'usuari
     * @param cognoms String amb el cognom de l'usuari
     * @return True si ja existeix un usuari a la llista amb el mateix nom, false en cas constrari
     */
    public boolean nomComplertRepetit (String nom, String cognoms){
        for (int i = 0; i < dtm.getRowCount(); i++) {//recorrem la fila
            int j=0; //columna
            Object valor = dtm.getValueAt(i,j); //obtenim el valor de la casella
            if (valor instanceof String && nom.strip().equalsIgnoreCase((String) valor)){//mirem que sigui string i sigui igual a algun, si es aixi true
                j=1;
                valor = dtm.getValueAt(i,j);
                if (valor instanceof String && cognoms.strip().equalsIgnoreCase((String) valor))return true; //MIRAR COGNOM
            }
        }
        return false;
    }
}
