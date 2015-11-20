/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kayttaja;

/**
 *
 * @author Simo
 */
public class Pisteytys {
    
    private int pisteet;
    
    /**
     * Konstruktori
     * alustaa pisteet
     */
    
    public Pisteytys() {
        this.pisteet = 0;
    }
    
    /**
     * 
     * @return palauttaa käyttäjän pisteet
     */
    
    public int getPisteet() {
        return this.pisteet;
    }
    
    /**
    Lisätään käyttäjälle 100 pistettä oikeasta vastauksesta
    */
    
    public void vastausOikein() {
        this.pisteet += 100;
    }
    
    /**
    Vähennetään käyttäjältä 25 pistettä väärästä vastauksesta.
    */
    
    public void vastausVaarin() {
        this.pisteet -= 25;
    }
    
    /**
    Pisteyden nollausmahdollisuus mikäli sille on tarvetta.
    */
    
    public void nollaaPisteet() {
        this.pisteet = 0;
    }
    
    /**
    Mahdolisuus asettaa haluamasi pisteet esim huijaustilanteessa
    */
    
    public void asetaPisteet(int pojot) {
        this.pisteet = pojot;
    }
    
}
