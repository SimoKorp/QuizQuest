/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kysymykset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import Kysymykset.Kysymys;

/**
 *
 * @author Simo
 */
public class KysymysLista {
    
    private Map<Integer, Kysymys> kysymykset;
    private int randomNumeroYksi;
    private int randomNumeroKaksi;
    private int randomNumeroKolme;
    private Kysymys kysymysYksi;
    private Kysymys kysymysKaksi;
    private Kysymys kysymysKolme;
    private ArrayList<Kysymys> valmiitKysymykset;
    
    
    
    public KysymysLista() {
        this.valmiitKysymykset = new ArrayList<Kysymys>();
        this.kysymykset = new HashMap();
        this.kysymysYksi = null;
        this.kysymysKaksi = null;
        this.kysymysKolme = null;
        lisaaKysymykset();
        KysymyksenArpoja();
        valmiitKysymykset();
    }
    
    
    public void lisaaKysymykset() {
        
        this.kysymykset.put(1, new Kysymys("Kuinka paljon on 3+4?", "7"));
        this.kysymykset.put(2, new Kysymys("Kuinka korkea on eifel-torni?", "300"));
        this.kysymykset.put(3, new Kysymys("Miten monta sormea minulla on?", "19"));
        this.kysymykset.put(4, new Kysymys("Kuinka monta levyä Elviksellä on?", "90"));
        this.kysymykset.put(5, new Kysymys("Kuinka monta listaykköstä MJ:llä on?", "13"));
        this.kysymykset.put(6, new Kysymys("Kuinka monta studio albumia Nightwishilla on?", "8"));
        this.kysymykset.put(7, new Kysymys("Kuinka monta studio albumia Metallicalla on", "9"));
        this.kysymykset.put(8, new Kysymys("Kuinka monta mestaruutta LA Clippersillä on?", "0"));
        this.kysymykset.put(9, new Kysymys("Kuinka monta vuotta yliopisto kestää?", "12"));
        this.kysymykset.put(10, new Kysymys("Kuinka monta mestaruutta Montreal Canadienssillä on?", "24"));
        this.kysymykset.put(11, new Kysymys("Kuinka monta listaykköstä Max Martinilla on?", "22"));
        this.kysymykset.put(12, new Kysymys("Kuinka monta lintulajia maailmassa on?", "10000"));
        this.kysymykset.put(13, new Kysymys("Kuinka pitkä matka on helsingistä poriin?", "250"));
        this.kysymykset.put(14, new Kysymys("Kuinka monta mestaruutta LA Lakersilla on?", "17"));
        this.kysymykset.put(15, new Kysymys("Kuinka monta kieltä maailmassa puhutaan?", "6500"));
        this.kysymykset.put(16, new Kysymys("Kuinka monta lasta Angelina Joliella on?", "6"));
        this.kysymykset.put(17, new Kysymys("Kuinka monta lasta Bill Cosbyllä on?", "5"));
        this.kysymykset.put(18, new Kysymys("Kuinka syvä on mariaanien hauta", "10809"));
        this.kysymykset.put(19, new Kysymys("Miten korkea on Mount Everest?", "8848"));
        this.kysymykset.put(20, new Kysymys("Kuinka pitkäksi valkohai voi kasvaa?", "4"));
    }
    
    
    //Kysymyksen arpoja on vielä pahasti kesken eikä toimi vielä oikein
    public void KysymyksenArpoja() {
        Random rand = new Random();
        this.randomNumeroYksi = rand.nextInt(this.kysymykset.size())+1;
        while (true) {
        int randomNumero = rand.nextInt(this.kysymykset.size()+1);
        if (randomNumero != this.randomNumeroYksi) {
            this.randomNumeroKaksi = randomNumero;
            break;
        }
    }
        while (true) {
            int randomNumero = rand.nextInt(this.kysymykset.size())+1;
            if (randomNumero != this.randomNumeroYksi || randomNumero != this.randomNumeroKaksi) {
                this.randomNumeroKolme = randomNumero;
                break;
            }
        }
        this.kysymysYksi = this.kysymykset.get(this.randomNumeroYksi);
        this.kysymysKaksi = this.kysymykset.get(this.randomNumeroKaksi);
        this.kysymysKolme = this.kysymykset.get(this.randomNumeroKolme);
    }
    
    
        public void valmiitKysymykset() {
            this.valmiitKysymykset.clear();
            this.valmiitKysymykset.add(kysymysYksi);
            this.valmiitKysymykset.add(kysymysKaksi);
            this.valmiitKysymykset.add(kysymysKolme);
            Collections.shuffle(valmiitKysymykset);
        }
        
        public Kysymys getKysymys1() {
            return this.kysymysYksi;
        }
        
        public Kysymys getKysymys2() {
            return this.kysymysKaksi;
        }
        
        public Kysymys getKysymys3() {
            return this.kysymysKolme;
        }
        
        public int getRandomNumeroYksi() {
            return randomNumeroYksi;
        }
        
        public int getRandomNumeroKaksi() {
            return randomNumeroKaksi;
        }
        
        public int getRandomNumeroKolme() {
            return randomNumeroKolme;
        }
        
        public ArrayList getKysymykset() {
            return this.valmiitKysymykset;
        }
    
}