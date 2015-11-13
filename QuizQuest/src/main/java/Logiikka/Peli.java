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

    private int maxKysymykset;
    private Seikkailija seikkailija;
    private String oikeaVastaus;
    private String vastaus;

    public Peli() {
        this.maxKysymykset = 10;
        this.seikkailija = new Seikkailija("Riitta", "Uhmakas");

    }

    public KysymysLista kysy() {

        KysymysLista kysymykset = new KysymysLista();
        this.oikeaVastaus = kysymykset.getKysymys1().getKysymys();
        return kysymykset;

    }

    public boolean vastaus(String vastaus) {

        return this.oikeaVastaus.equals(vastaus);
    }

    public Seikkailija getSeikkailija() {
        return this.seikkailija;
    }
}
