/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Simo
 */
import java.awt.*;
import javax.swing.*;
import java.util.*;
import Logiikka.Peli;
import Kysymykset.Kysymys;
import Kysymykset.KysymysLista;
import Kayttaja.Seikkailija;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Simo
 */
//alkutekijöissä vielä :)
public class Grafiikka implements Runnable {

    private Seikkailija seikkailija;
    private String Nimi;
    private JFrame frame;
    private JTextArea kysymysLaatikko;
    private JButton buttonA;
    private JButton buttonB;
    private JButton buttonC;
    private Peli peli;

    /**
     * Konstruktori
     *
     * @param peli parametrina peli
     */
    public Grafiikka(Peli peli) {
        this.peli = peli;
    }

    /**
     * Luo ja ajaa kyttöliittymää
     */
    @Override
    public void run() {
        frame = new JFrame("QuizQuest");
        frame.setPreferredSize(new Dimension(1000, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoKomponentit(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
        keskitaIkkuna(frame);
        refresh();
    }

    private void luoKomponentit(Container container) {;
        this.kysymysLaatikko = new JTextArea();
        this.buttonA = new JButton();
        this.buttonB = new JButton();
        this.buttonC = new JButton();

        ActionListener kuuntelija = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String viesti;
                if (peli.vastaus(((JButton) e.getSource()).getText())) {
                    peli.getSeikkailija().vastausOikein();
                    viesti = "OIKEIN!";

                } else {
                    peli.getSeikkailija().vastausVaarin();
                    viesti = "VÄÄRIN";
                }
                JOptionPane.showMessageDialog((JButton) e.getSource(), viesti);
                refresh();
            }

        };
        buttonA.addActionListener(kuuntelija);
        buttonB.addActionListener(kuuntelija);
        buttonC.addActionListener(kuuntelija);
        container.add(kysymysLaatikko);
        container.add(paneloi(), BorderLayout.SOUTH);
    }

    private JPanel paneloi() {
        JPanel panel = new JPanel(new GridLayout(1, 3));
        panel.add(buttonA);
        panel.add(buttonB);
        panel.add(buttonC);
        return panel;
    }

    private void refresh() {
        KysymysLista lista = peli.kysy();

        if (!lista.onkoKysytytTaynna()) {  //Peli loppuu vihdoin! mutta lopetusilmoituksen teko on vielä kesken
                                            
            if (!lista.getKysymys1().onkoKysytty()) {
                kysymysLaatikko.setText(lista.getKysymys1().getVastaus() + "\n" + "\n" + peli.getSeikkailija().toString());
                lista.getKysymys1().Kysytty();
                lista.lisaaKysyttyihin(lista.getKysymys1());
            } else if (!lista.getKysymys2().onkoKysytty()) {
                kysymysLaatikko.setText(lista.getKysymys2().getVastaus() + "\n" + "\n" + peli.getSeikkailija().toString());
                lista.getKysymys2().Kysytty();
                lista.lisaaKysyttyihin(lista.getKysymys2());
            } else {
                kysymysLaatikko.setText(lista.getKysymys3().getVastaus() + "\n" + "\n" + peli.getSeikkailija().toString());
                lista.getKysymys3().Kysytty();
                lista.lisaaKysyttyihin(lista.getKysymys3());
            }

            ArrayList<Kysymys> vaihtoehdot = lista.getKysymykset();
            buttonA.setText(vaihtoehdot.get(0).getKysymys());
            buttonB.setText(vaihtoehdot.get(1).getKysymys());
            buttonC.setText(vaihtoehdot.get(2).getKysymys());
        } else {
            kysymysLaatikko.setText(peli.getSeikkailija().toString() + "\n " + "Peli on päättynyt");
            buttonA.setText("HIENO");
            buttonB.setText("HOMMA");
            buttonC.setText("HERMANNI");
        }
    }

    /**
     *
     * @return palauttaa JFramen
     */
    public JFrame getFrame() {
        return frame;
    }

    /**
     * Keskittää ikkunan suhteutettuna päätelaitteen kokoon
     *
     * @param frame parametrina ikkuna
     */
    public static void keskitaIkkuna(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.width / 2 - frame.getSize().width / 2));
        int y = (int) ((dimension.height / 2 - frame.getSize().height / 2));
        frame.setLocation(x, y);
    }

}
