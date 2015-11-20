/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kysymykset;

/**
 *
 * @author Simo
 */
public class Kysymys {

    private String kysymys;
    private String vastaus;
    private Boolean kysytty;

    /**
     * Konstruktori
     * Luodaan kysymys ja sen vastaus sekä boolean  josta selviää onko sitä kysytty
     * 
     * @param kysymys parametrina kysymys
     * @param vastaus parametrina vastaus kysymykseen
     */
    
    public Kysymys(String kysymys, String vastaus) {
        this.kysymys = kysymys;
        this.vastaus = vastaus;
        this.kysytty = false;
    }

    /**
     * 
     * @return palauttaa vastauksen
     */
    
    public String getVastaus() {
        return this.vastaus;
    }
    
    /**
     * 
     * @return palauttaa kysymyksen
     */

    public String getKysymys() {
        return this.kysymys;
    }
    
    /**
    vaihtaa kysymyksen kysytyksi
    */

    public void Kysytty() {
        this.kysytty = true;
    }
    
    /**
     * 
     * @return palauttaa kysymyksen kysytty-totuusarvon
     */

    public boolean onkoKysytty() {
        return kysytty;
    }
    
    /**
     * 
     * @return palauttaa nimen tulostusasussa
     */

    public String toString() {
        return getKysymys() + " - " + getVastaus();
    }
}
