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
    
    
    
    public Seikkailija(String nimi, String adjektiivi) {
        this.nimi = adjektiivi + " " + nimi;
        this.pojot = new Pisteytys();
    }
    
    public int getPisteet() {
        return this.pojot.getPisteet();
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public void vastausOikein() {
        this.pojot.vastausOikein();
    }
    
    public void vastausVaarin() {
        this.pojot.vastausVaarin();
    }
    
    public void nollaaPisteet() {
        this.pojot.nollaaPisteet();
    }
    
    public void asetaPisteet(int pojot) {
        this.pojot.asetaPisteet(pojot);
    }
    
    
    
    public void VaihdaEeppinenNimi(int pisteet) {
        if(pisteet <= 2000) {
            this.nimi = this.nimi + " The Golden Gryphon of Greatness!";
        }
        else if (pisteet <= 1800) {
            this.nimi = this.nimi + " The Student Who Became the Magister";
        }
        
        else if (pisteet > 300 && pisteet < 1800) {
            this.nimi = this.nimi + " Who More to Learn Still Has";
        }
    }
    
    public void VaihdaParjaavaNimi(int pisteet) {
        if (pisteet <300) {
            this.nimi = this.nimi + " The One Who Mom Kicked Out";
        }
    }
    
    
    @Override
    public String toString() {
        return this.nimi + " Pisteillä: " + getPisteet();
    }
    
    
    
    
    
}
