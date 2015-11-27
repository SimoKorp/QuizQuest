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

        if (kysymykset.getKysymys1().onkoKysytty()) {
            this.oikeaVastaus = kysymykset.getKysymys2().getKysymys();
        } else if (kysymykset.getKysymys2().onkoKysytty()) {
            this.oikeaVastaus = kysymykset.getKysymys3().getKysymys();
        } else {
            this.oikeaVastaus = kysymykset.getKysymys1().getKysymys();
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
}
