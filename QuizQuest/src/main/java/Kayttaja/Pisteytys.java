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
    
    
    public Pisteytys() {
        this.pisteet = 0;
    }
    
    public int getPisteet() {
        return this.pisteet;
    }
    
    public void vastausOikein() {
        this.pisteet += 100;
    }
    
    public void vastausVaarin() {
        this.pisteet -= 25;
    }
    
    public void nollaaPisteet() {
        this.pisteet = 0;
    }
    
    public void asetaPisteet(int pojot) {
        this.pisteet = pojot;
    }
    
}
