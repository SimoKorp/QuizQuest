/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka;
/**
 *
 * @author Simo
 */

import java.awt.*;
import javax.swing.*;
import Kayttaja.Seikkailija;
import Kysymykset.Kysymys;
import GUI.Grafiikka;
import Logiikka.Peli;

/**
 * 
 * Pääohjelma
 */

public class main {

    /**
     * ajaa pelin ja grafiikan
     * @param args 
     */
    public static void main(String[] args) {

        Peli p = new Peli();
        Grafiikka g  = new Grafiikka(p);
        SwingUtilities.invokeLater(g);
    }

}
