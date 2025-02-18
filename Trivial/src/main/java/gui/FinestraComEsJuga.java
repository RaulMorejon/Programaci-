package gui;

import javax.swing.*;

public class FinestraComEsJuga extends JFrame {
    private JPanel panellComEsJuga;

    public FinestraComEsJuga (){
        this.setContentPane(panellComEsJuga); //Per poder visualitzar la finestra
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Tanca per complet quan li dones a la creu
        this.pack(); //empaquetar
        this.setLocationRelativeTo(null); //que es vegui al centre
        this.setVisible(true); //Finestra visible
        this.setTitle("Com es Juga? - Trivial");
        this.setSize(1300, 900);
        this.setResizable(false);
    }

}
