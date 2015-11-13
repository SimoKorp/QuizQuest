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
    
    
    
    public Kysymys(String kysymys, String vastaus) {
        this.kysymys= kysymys;
        this.vastaus = vastaus;
    }
    
    public String getVastaus() {
        return this.vastaus;
    }
    
    public String getKysymys() {
        return this.kysymys;
    }
    
    public String toString() {
        return getKysymys() + " - " + getVastaus();
    }
}



