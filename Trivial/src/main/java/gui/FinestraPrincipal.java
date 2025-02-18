package gui;

import com.iesebre.usefulcode.DirectAccessFile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

/*
1920x1080

PANTALLA DE CARGA????


JTabbedPane para poner pestañas de cada cosa -> addtab en boton derecho encima de la pestaña creada
Guardar info en fixeros:
    - Preguntas con sus respuestas y opciones diferentes (3 columnas)
    - Usuarios con: (6 columnas)
        - Nombre y apellido
        - Edad
        - Pais de nacimiento
        - nº partidas jugadas
        - nº partidas ganadas
        - nºpreguntas acertadas

pagina inicial: (botones que dirijan a otra pagina o cambie la misma)


    - Partida:
        - Opción de cuantos jugadores se quieren jugar (opcion elegir): dirigir a ventana con ->
            - Puntuación de cada uno
            - Quien tiene el turno
            - Pregunta
            - A que categoria pertenece la pregunta
            - Despelgable con respuestas
            - (opcional) Imagen realcionada con la pregunta
            - Temporizador (competitivo?)
        - Jugar por categorias diferentes o monocategoria

    - Como se juega
        - Instrucciones
        - Información de las puntuaciónes segun lo que se tarda en contestar

    - Banc de Preguntes
 */
public class FinestraPrincipal extends JFrame{
    private JPanel panellPrincipal;
    private JButton botoRegistra;
    private JButton botoUsuaris;
    private JButton botoComEsJuga;
    private JButton botoJugar;
    private JButton botoBancPreguntes;
    private static DirectAccessFile<Pojo> daf; //fitxer
    private FinestraLlista finestraLlista;


    public FinestraPrincipal() throws IOException, ClassNotFoundException {
        this.setContentPane(panellPrincipal); //Per poder visualitzar la finestra
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Tanca per complet quan li dones a la creu
        this.pack(); //empaquetar
        this.setLocation(400, 200); //que es vegui al centre
        this.setVisible(true); //Finestra visible
        this.setTitle("Trivial");
        this.setSize(1300, 900);
        this.setResizable(false);

        daf = new DirectAccessFile<>("dadesUsuaris.dat");//Inicialitzar fitxer

        //FINESTRA JUGAR
        botoJugar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                FinestraJugar finestraJugar = new FinestraJugar();//creem la finestra
                Point ubicacio = getLocation();//ubicació primera finestra
                finestraJugar.setLocation(ubicacio.x, ubicacio.y);//segona finestra al mateix lloc
                finestraJugar.setVisible(true);
                // Quan tanca la segona finestra, la principal es fa visible
                finestraJugar.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        setVisible(true);
                    }
                });
            }
        });
        //FINESTRA LLISTAT USUARIS
        botoUsuaris.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                try {
                    finestraLlista = new FinestraLlista();//instanciem la clase
                } catch (IOException | ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null,"Hi ha hagut un problema per obrir la Lista");
                }
                Point ubicacio = getLocation();//ubicació primera finestra
                finestraLlista.setLocation(ubicacio.x, ubicacio.y);//segona finestra al mateix lloc
                finestraLlista.setVisible(true);//mostra la llista creada abants
                // Quan tanca la segona finestra, la principal es fa visible
                finestraLlista.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        setVisible(true);
                    }
                });
            }
        });
        //FINESTRA REGISTRAT
        botoRegistra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                FinestraRegistrat finestraRegistrat = null;//creem la finestra
                try {
                    finestraRegistrat = new FinestraRegistrat(finestraLlista);
                } catch (IOException | ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Hi ha hagut algun problema amb el registre");
                }
                Point ubicacio = getLocation();//ubicació primera finestra
                finestraRegistrat.setLocation(ubicacio.x, ubicacio.y);//segona finestra al mateix lloc
                finestraRegistrat.setVisible(true);
                // Quan tanca la segona finestra, la principal es fa visible
                finestraRegistrat.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        setVisible(true);
                    }
                });
            }
        });
        //FINESTRA COM ES JUGA?
        botoComEsJuga.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                FinestraComEsJuga finestraComEsJuga = new FinestraComEsJuga();//creem la finestra
                Point ubicacio = getLocation();//ubicació primera finestra
                finestraComEsJuga.setLocation(ubicacio.x, ubicacio.y);//segona finestra al mateix lloc
                finestraComEsJuga.setVisible(true);
                // Quan tanca la segona finestra, la principal es fa visible
                finestraComEsJuga.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        setVisible(true);
                    }
                });
            }
        });
        //FINESTRA BANC DE PREGUNTES
        botoBancPreguntes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                FinestraBancPreguntes finestraBancPreguntes = new FinestraBancPreguntes();//creem la finestra
                Point ubicacio = getLocation();//ubicació primera finestra
                finestraBancPreguntes.setLocation(ubicacio.x, ubicacio.y);//segona finestra al mateix lloc
                finestraBancPreguntes.setVisible(true);
                // Quan tanca la segona finestra, la principal es fa visible
                finestraBancPreguntes.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        setVisible(true);
                    }
                });
            }
        });

    }

    /**
     * Comparteix el fitxer creat
     * @return el fitxer creat en aquesta clase
     */
    public static DirectAccessFile obtenirFitxer (){
        return daf;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { //Per executar la finestra
            @Override
            public void run() {
                try {
                    new  FinestraPrincipal();
                } catch (IOException | ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}


