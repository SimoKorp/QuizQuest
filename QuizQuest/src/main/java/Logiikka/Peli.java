/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka;

import java.util.Random;
import Kysymykset.KysymysLista;
import Kayttaja.Seikkailija;

/**
 *
 * @author Simo
 */
public class Peli {

    private Seikkailija seikkailija;
    private String oikeaVastaus;
    private String vastaus;
    private KysymysLista kysymykset;
    private String tarina;

    /**
     * Konstruktori luo uuden käyttäjän ja kysymyslistan
     */
    public Peli() {
        this.seikkailija = new Seikkailija("Käpistelijä", "Pikku");
        kysymykset = new KysymysLista();
    }

    /**
     *
     * @return ajaa sekoita metodin ja valitsee oikean vastauksen kysyttävään
     * kysymykseen. Sitten palauttaa kysymyslistan
     *
     */
    public KysymysLista kysy() {
        kysymykset.sekoita();

        if (!kysymykset.getKysymys1().onkoKysytty()) {
            this.oikeaVastaus = kysymykset.getKysymys1().getKysymys();
        } else if (!kysymykset.getKysymys2().onkoKysytty()) {
            this.oikeaVastaus = kysymykset.getKysymys2().getKysymys();
        } else {
            this.oikeaVastaus = kysymykset.getKysymys3().getKysymys();
        }
        return kysymykset;

    }

    /**
     *
     * @param vastaus vastaus kysymykseen
     * @return palauttaa onko vastaus oikea vai ei
     */
    public boolean vastaus(String vastaus) {

        return this.oikeaVastaus.equals(vastaus);
    }

    /**
     *
     * @return palauttaa käyttäjän
     */
    public Seikkailija getSeikkailija() {
        return this.seikkailija;
    }
    
    /**
     * Metodi tulostaa osan runoa pelaajan pisteiden mukaan
     * @param pisteet parametrinä pelaajan pisteet
     * @return 
     */

    public String tarinoi(int pisteet) {
        if (pisteet <= 2000 && pisteet > 1800) {
            tarina = ("I met a traveller from an antique land\n"
                    + "Who said: Two vast and trunkless legs of stone\n"
                    + "Stand in the desert.\n"
                    + "Near them on the sand,\n"
                    + "Half sunk, a shatter'd visage lies, whose frown\n"
                    + "And wrinkled lip and sneer of cold command.\n\n"
                    + "Tell that its sculptor well those passions read\n"
                    + "Which yet survive, stamp'd on these lifeless things,\n"
                    + "The hand that mock'd them and the heart that fed.\n\n"
                    + "And on the pedestal these words appear:\n"
                    + "My name is Ozymandias, king of kings:\n"
                    + "Look on my works, ye Mighty, and despair!\n\n"
                    + "Nothing beside remains: round the decay\n"
                    + "Of that colossal wreck, boundless and bare,\n"
                    + "The lone and level sands stretch far away.\n\n"
                    + "OLET PÄIHITTÄNYT PELIN! ONNITTELUT!");
        } else if (pisteet <= 1800 && pisteet > 1600) {
            tarina = ("I met a traveller from an antique land\n"
                    + "Who said: Two vast and trunkless legs of stone\n"
                    + "Stand in the desert.\n"
                    + "Near them on the sand,\n"
                    + "Half sunk, a shatter'd visage lies, whose frown\n"
                    + "And wrinkled lip and sneer of cold command.\n\n"
                    + "Tell that its sculptor well those passions read\n"
                    + "Which yet survive, stamp'd on these lifeless things,\n"
                    + "The hand that mock'd them and the heart that fed.\n\n"
                    + "And on the pedestal these words appear:\n"
                    + "My name is Ozymandias, king of kings:\n"
                    + "Look on my works, ye Mighty, and despair!\n\n"
                    + "AVAA LOPUT SUUREMMILLA PISTEILLÄ!");
        } else if (pisteet <= 1600 && pisteet > 1200) {
            tarina = ("I met a traveller from an antique land\n"
                    + "Who said: Two vast and trunkless legs of stone\n"
                    + "Stand in the desert.\n"
                    + "Near them on the sand,\n"
                    + "Half sunk, a shatter'd visage lies, whose frown\n"
                    + "And wrinkled lip and sneer of cold command.\n\n"
                    + "Tell that its sculptor well those passions read\n"
                    + "Which yet survive, stamp'd on these lifeless things,\n"
                    + "The hand that mock'd them and the heart that fed.\n\n"
                    + "AVAA LOPUT SUUREMMILLA PISTEILLÄ!");
        } else if (pisteet <= 1200 && pisteet > 900) {
            tarina = ("I met a traveller from an antique land\n"
                    + "Who said: Two vast and trunkless legs of stone\n"
                    + "Stand in the desert.\n\n"
                    + "Near them on the sand,\n"
                    + "Half sunk, a shatter'd visage lies, whose frown\n"
                    + "And wrinkled lip and sneer of cold command.\n\n"
                    + "AVAA LOPUT SUUREMMILLA PISTEILLÄ!");
        } else if (pisteet < 900 && pisteet > 500) {
            tarina = ("I met a traveller from an antique land\n"
                    + "Who said: Two vast and trunkless legs of stone\n"
                    + "Stand in the desert.\n\n"
                    + "AVAA LOPUT SUUREMMILLA PISTEILLÄ!");
        } else {
            tarina = ("(505) 503-4455\n"
                    + "Saul Goodman\n"
                    + "Attorney At Law");
        }
        return tarina;
    }

}
