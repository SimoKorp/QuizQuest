/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kysymykset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Kysymykset.KysymysLista;

/**
 *
 * @author Simo
 */
public class KysymysListaTest {

    private Map<Integer, Kysymys> kysymykset;
    private Kysymys kysymys;
    private int randomNumeroYksi;
    private int randomNumeroKaksi;
    private int randomNumeroKolme;
    private Kysymys kysymysYksi;
    private Kysymys kysymysKaksi;
    private Kysymys kysymysKolme;
    private int arvo;

    public KysymysListaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.kysymys = new Kysymys("1+2", "3");
        this.kysymykset = new HashMap();

    }

    @After
    public void tearDown() {
    }

    /**
     * Testaa toimiiko kysymysten lisäys oikein
     */
    @Test
    public void toimiikoKysymystenLisays() {
        kysymykset.put(2, kysymys);
        String toString = kysymykset.toString();
        assertEquals("{2=1+2 - 3}", toString);
    }
    
    /**
     * Testaa onko arvottavat vastausvaihtoehdot keskenään erilaiset
     */

    @Test
    public void ovatkoVastausVaihtoehdotErilaiset() {
        this.kysymykset.put(1, new Kysymys("Kuinka paljon on 3+4?", "7"));
        this.kysymykset.put(2, new Kysymys("Kuinka korkea on eifel-torni?", "300"));
        this.kysymykset.put(3, new Kysymys("Miten monta sormea minulla on?", "19"));
        this.kysymykset.put(4, new Kysymys("Kuinka monta levyä Elviksellä on?", "90"));

        Random rand = new Random();
        this.randomNumeroYksi = rand.nextInt(this.kysymykset.size()) + 1;
        while (true) {
            int randomNumero = rand.nextInt(this.kysymykset.size()) + 1;
            if (randomNumero != this.randomNumeroYksi) {
                this.randomNumeroKaksi = randomNumero;
                break;
            }
        }
        while (true) {
            int randomNumero = rand.nextInt(this.kysymykset.size()) + 1;
            if (randomNumero != this.randomNumeroYksi && randomNumero != this.randomNumeroKaksi) {
                this.randomNumeroKolme = randomNumero;
                break;
            }
        }
        this.kysymysYksi = this.kysymykset.get(this.randomNumeroYksi);
        this.kysymysKaksi = this.kysymykset.get(this.randomNumeroKaksi);
        this.kysymysKolme = this.kysymykset.get(this.randomNumeroKolme);

        assertEquals(false, this.kysymysYksi.getKysymys().equals(this.kysymysKolme.getKysymys()));
        assertEquals(false, this.kysymysKaksi.getKysymys().equals(this.kysymysKolme.getKysymys()));
        assertEquals(false, this.kysymysYksi.getKysymys().equals(this.kysymysKaksi.getKysymys()));
    }
    
    /**
     * Testaa toimiiko halutun kysymyksen avaimenhaku oikein
     */

    @Test
    public void toimiikoAvaimenHaku() {
        kysymykset.put(5, this.kysymys);
        if (this.kysymykset.containsValue(this.kysymys)) {
            for (Map.Entry<Integer, Kysymys> i : this.kysymykset.entrySet()) {
                if (i.getValue().equals(this.kysymys)) {
                    this.arvo = i.getKey();
                }

            }
        }
        assertEquals(5, this.arvo);
    }
}
