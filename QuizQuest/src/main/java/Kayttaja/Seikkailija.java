/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kayttaja;
import java.util.*;

/**
 *
 * @author Simo
 */
public class Seikkailija {
    
    
    private String nimi;
    private final Pisteytys pojot;
    
    /**
     * Konstruktori
     * @param nimi luodaan käyttäjälle nimi
     * @param adjektiivi lisätään nimen eteen parametrina saatu adjektiivi
     */
    
    
    public Seikkailija(String nimi, String adjektiivi) {
        this.nimi = adjektiivi + " " + nimi;
        this.pojot = new Pisteytys();
    }
    
    /**
     * 
     * @return palauttaa käyttäjän pisteet
     */
    
    public int getPisteet() {
        return this.pojot.getPisteet();
    }
    
    /**
     * 
     * @return palauttaa käyttäjän nimen
     */
   
    public String getNimi() {
        return this.nimi;
    }
    
    /**
    Pisteytysluokasta hyödynnetään metodia vastausOikein
    */
    
    public void vastausOikein() {
        this.pojot.vastausOikein();
    }
    
    /**
    Pisteytysluokasta hyödynnetään metodia vastausVaarin
    */
    
    public void vastausVaarin() {
        this.pojot.vastausVaarin();
    }
    
    /**
    Pisteytysluokasta hyödynnetään metodia nollaaPisteet
    */
    
    public void nollaaPisteet() {
        this.pojot.nollaaPisteet();
    }
    
    /**
     * asettaa käyttäjälle halutut pisteet
     * @param pojot parametrina asetettavat pisteet
     */
    public void asetaPisteet(int pojot) {
        this.pojot.asetaPisteet(pojot);
    }
    
    /**
     * Asettaa käyttäjälle uuden nimen tämän pisteiden mukaan
     * @param pisteet parametrina käyttäjän pisteet
     */
    
    public void VaihdaEeppinenNimi(int pisteet) {
        if(pisteet <= 2000 && pisteet > 1800) {
            this.nimi = this.nimi + " A.K.A Heisenberg";
        }
        else if (pisteet <= 1800 && pisteet > 1200) {
            this.nimi = this.nimi + " The One Who Knocks!";
        }
        
        else if (pisteet > 300 && pisteet <= 1200) {
            this.nimi = this.nimi + " The Blowfish";
        }
    }
    
    /**
     * Asettaa haukkuvamman nimen käyttäjälle huonojen pisteiden johdosta
     * @param pisteet parametrina käyttäjän pisteet
     */
    
    public void VaihdaParjaavaNimi(int pisteet) {
        if (pisteet < 300) {
            this.nimi = this.nimi + " Who better call Saul";
        }
    }
    
    /**
     * 
     * @return palauttaa nimen tulostusasussa
     */
    @Override
    public String toString() {
        return this.nimi + " Pisteillä: " + getPisteet();
    }
    
    
    
    
    
}
