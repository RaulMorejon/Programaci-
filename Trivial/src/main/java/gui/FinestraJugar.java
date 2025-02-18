package gui;

import javax.swing.*;

public class FinestraJugar extends JFrame{
    private JPanel panellJugar;

    public FinestraJugar(){
        this.setContentPane(panellJugar); //Per poder visualitzar la finestra
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Tanca per complet quan li dones a la creu
        this.pack(); //empaquetar
        this.setLocationRelativeTo(null); //que es vegui al centre
        this.setVisible(true); //Finestra visible
        this.setTitle("Jugar - Trivial");
        this.setSize(1300, 900);
        this.setResizable(false);
    }



}
