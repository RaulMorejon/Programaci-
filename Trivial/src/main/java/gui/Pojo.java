package gui;

import com.iesebre.usefulcode.DirectAccessFile;
import javax.swing.*;
import java.awt.*;
import java.security.PrivateKey;

public class Pojo extends JFrame {




    private String nom;
    private String cognoms;
    private int edat;
    private String nacionalitat;
    private int partidesJugades;
    private int partidesGuanyades;
    private int preguntesAcertades;
    private int nivell;


    public Pojo(String nom, String cognoms, int edat, String nacionalitat, int partidesJugades, int partidesGuanyades, int preguntesAcertades, int nivell) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.edat = edat;
        this.nacionalitat = nacionalitat;
        this.partidesJugades = partidesJugades;
        this.partidesGuanyades = partidesGuanyades;
        this.preguntesAcertades = preguntesAcertades;
        this.nivell = nivell;
    }
    public Pojo(String nom, String cognoms, int edat, String nacionalitat, int partidesJugades, int partidesGuanyades, int preguntesAcertades) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.edat = edat;
        this.nacionalitat = nacionalitat;
        this.partidesJugades = partidesJugades;
        this.partidesGuanyades = partidesGuanyades;
        this.preguntesAcertades = preguntesAcertades;
    }
    public Pojo(String nom, String cognoms, int edat, String nacionalitat, int partidesJugades, int partidesGuanyades) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.edat = edat;
        this.nacionalitat = nacionalitat;
        this.partidesJugades = partidesJugades;
        this.partidesGuanyades = partidesGuanyades;
    }
    public Pojo(String nom, String cognoms, int edat, String nacionalitat, int partidesJugades) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.edat = edat;
        this.nacionalitat = nacionalitat;
        this.partidesJugades = partidesJugades;
    }
    public Pojo(String nom, String cognoms, int edat, String nacionalitat) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.edat = edat;
        this.nacionalitat = nacionalitat;
    }
    public Pojo(String nom, String cognoms, int edat) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.edat = edat;
    }
    public Pojo(String nom, String cognoms) {
        this.nom = nom;
        this.cognoms = cognoms;
    }
    public Pojo(String nom){
        this.nom = nom;
    }
    public Pojo (){};


    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }
    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public int getEdat() {
        return edat;
    }
    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getNacionalitat() {
        return nacionalitat;
    }
    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }

    public int getPartidesJugades() {
        return partidesJugades;
    }
    public void setPartidesJugades(int partidesJugades) {
        this.partidesJugades = partidesJugades;
    }

    public int getPartidesGuanyades() {
        return partidesGuanyades;
    }
    public void setPartidesGuanyades(int partidesGuanyades) {
        this.partidesGuanyades = partidesGuanyades;
    }

    public int getPreguntesAcertades() {
        return preguntesAcertades;
    }
    public void setPreguntesAcertades(int preguntesAcertades) {
        this.preguntesAcertades = preguntesAcertades;
    }

    public int getNivell() {
        return nivell;
    }
    public void setNivell(int nivell) {
        this.nivell = nivell;
    }
}
